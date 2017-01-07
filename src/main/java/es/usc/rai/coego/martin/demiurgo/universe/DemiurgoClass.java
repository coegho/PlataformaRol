package es.usc.rai.coego.martin.demiurgo.universe;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.tree.ParseTree;

import es.usc.rai.coego.martin.demiurgo.json.JsonClass;
import es.usc.rai.coego.martin.demiurgo.json.JsonMethod;
import es.usc.rai.coego.martin.demiurgo.json.JsonVariable;
import es.usc.rai.coego.martin.demiurgo.values.ValueInterface;

/**
 * Represents a class in the world defined by the user. These classes will be
 * used to create new objects.
 * 
 * @author Martín Coego Pérez
 * @version %I%, %G%
 * @since 1.0
 *
 */
public class DemiurgoClass implements Comparable<DemiurgoClass> {
	protected String className;
	protected DemiurgoClass parentClass;
	protected Map<String, DefaultField> fields;
	protected Map<String, ClassMethod> methods;
	protected ClassMethod constructor;
	protected World world;
	protected String code;

	public DemiurgoClass(String className, String code, World world) {
		this.className = className;
		this.fields = new HashMap<>();
		this.methods = new HashMap<>();
		this.world = world;
		this.code = code;
	}

	public DemiurgoClass(String classname, String code) {
		this.className = classname;
		this.fields = new HashMap<>();
		this.methods = new HashMap<>();
		this.code = code;
	}

	public String getClassName() {
		return className;
	}

	public World getWorld() {
		return world;
	}

	public Map<String, DefaultField> getRealFields() {
		return fields;
	}

	public Map<String, DefaultField> getFields() {
		Map<String, DefaultField> map = new HashMap<>();
		map.putAll(parentClass.getFields());
		map.putAll(fields);
		return map;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	public void addField(String fieldName, ValueInterface defaultValue, ParseTree initialAssign) {
		fields.put(fieldName, new DefaultField(defaultValue, initialAssign));
	}

	public ValueInterface getField(String fieldName) {
		if (fields.containsKey(fieldName))
			return fields.get(fieldName).getField();
		else
			return parentClass.getField(fieldName);
	}

	public void addMethod(String methodName, ClassMethod method) {
		methods.put(methodName, method);
	}

	public ClassMethod getMethod(String methodName) {
		if (methods.containsKey(methodName))
			return methods.get(methodName);
		else
			return parentClass.getMethod(methodName);
	}

	public void setConstructor(ClassMethod constructor) {
		this.constructor = constructor;
	}

	public ClassMethod getConstructor() {
		return constructor;
	}

	public DemiurgoClass getParentClass() {
		return parentClass;
	}

	public void setParentClass(DemiurgoClass parentClass) {
		this.parentClass = parentClass;
	}

	public boolean inheritFrom(DemiurgoClass tryParent) {
		if (tryParent == world.getRootClass()) {
			return true;
		}
		DemiurgoClass p = this;
		while (p != world.getRootClass()) {
			if (p == tryParent) {
				return true;
			}
			p = p.getParentClass();
		}
		return false;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void rebuild(World world) {
		this.world = world;
	}

	public JsonClass toJson() {
		JsonClass jc = new JsonClass();
		jc.setCode(getCode());
		jc.setClassName(getClassName());
		jc.setParent(getParentClass().toJson());
		List<JsonVariable> f = new ArrayList<>();
		for (Entry<String, DefaultField> e : getParentClass().getFields().entrySet()) {
			f.add(new JsonVariable(e.getKey(), e.getValue().getField().getValueAsString(), e.getValue().getField().getTypeName()));
		}
		for (Entry<String, DefaultField> e : fields.entrySet()) {
			f.removeIf(v -> v.getName().equalsIgnoreCase(e.getKey()));
			f.add(new JsonVariable(e.getKey(), e.getValue().getField().getValueAsString(), e.getValue().getField().getTypeName()));
		}
		f.sort(Comparator.comparing(JsonVariable::getName));
		jc.setFields(f);

		List<JsonMethod> m = new ArrayList<>();
		for (Entry<String, ClassMethod> e : getMethods().entrySet()) {
			m.add(e.getValue().toJson(e.getKey()));
		}

		m.sort(Comparator.comparing(JsonMethod::getName));
		jc.setMethods(m);
		return jc;
	}

	/**
	 * Modify the current class' fields and methods to the new class' ones.
	 * 
	 * @param newClass
	 */
	public void modifyTo(DemiurgoClass newClass) {
		parentClass = newClass.parentClass;
		fields = newClass.fields;
		methods = newClass.methods;
		constructor = newClass.constructor;
		code = newClass.code;
	}

	public Map<String, ClassMethod> getMethods() {
		Map<String, ClassMethod> methods = new HashMap<String, ClassMethod>();
		if (!(this instanceof RootObjectClass)) {
			methods.putAll(this.getParentClass().getMethods());
		}
		methods.putAll(this.methods);
		return methods;
	}

	@Override
	public int compareTo(DemiurgoClass another) {
		return getClassName().compareTo(another.getClassName());
	}

	public void destroyClass() {
		List<DemiurgoObject> l = getWorld().getAllObjects().stream()
				.filter(o -> o.getClassName().equalsIgnoreCase(getClassName())).collect(Collectors.toList());
		for(DemiurgoObject o : l) {
			o.destroyObject(false);
		}
		getWorld().markToDestroy(this);
	}
	
	public class DefaultField {
		private ParseTree node;
		private ValueInterface value;
		
		public DefaultField(ValueInterface field, ParseTree initialAssign) {
			this.value = field;
			this.node = initialAssign;
		}
		
		public DefaultField(ValueInterface field) {
			this.value = field;
		}

		public ParseTree getInitialAssign() {
			return node;
		}
		
		public void setInitialAssign(ParseTree initialAssign) {
			this.node = initialAssign;
		}
		
		public ValueInterface getField() {
			return value;
		}
		
		public void setField(ValueInterface field) {
			this.value = field;
		}
	}
}
