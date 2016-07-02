package plataformarol;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import universe.ClassMethod;
import values.IReturnValue;

public class FunctionScope extends Scope {
	protected ClassMethod method;
	protected ObjectScope parent;
	protected Map<String, StoredSymbol> variables;
	
	public FunctionScope(ClassMethod method,
			List<IReturnValue> args, ObjectScope parent) {
		this.method = method;
		this.parent = parent;
		this.variables = new HashMap<>();
		for(int i = 0; i<args.size(); i++) {
			this.variables.put(method.getArgumentName(i), new StoredSymbol(args.get(i)));
		}
	}
	
	@Override
	public StoredSymbol getVariable(String name) {
		if(variables.containsKey(name))
			return variables.get(name);
		else
			return parent.getVariable(name);
	}

	@Override
	public void setVariable(String name, IReturnValue value) {
		variables.put(name, new StoredSymbol(value)); //TODO: a new StoredSymbol object?
		
	}

	public ObjectScope getParent() {
		return parent;
	}

}
