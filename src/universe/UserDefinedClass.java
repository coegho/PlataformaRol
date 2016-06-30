package universe;

import java.util.HashMap;
import java.util.Map;

import plataformarol.ClassMethod;
import plataformarol.IReturnValue;

public class UserDefinedClass {
	protected String className;
	protected Map<String, IReturnValue> fields;
	protected Map<String, ClassMethod> methods;
	
	public String getClassName() {
		return className;
	}
	
	public Map<String, IReturnValue> getDefaultVariables() {
		return fields;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
	public UserDefinedClass(String className) {
		this.className = className;
		this.fields = new HashMap<>();
		this.methods = new HashMap<>();
	}
	
	public UserDefinedClass(String className, Map <String, IReturnValue> defaultVariables) {
		this.className = className;
		this.fields = defaultVariables;
	}
	
	public void addField(String fieldName, IReturnValue defaultValue) {
		fields.put(fieldName, defaultValue);
	}
	
	public IReturnValue getField(String fieldName) {
		return fields.get(fieldName);
	}
	
	public void addMethod(String methodName, ClassMethod method) {
		methods.put(methodName, method);
	}
	
	public ClassMethod getMethod(String methodName) {
		return methods.get(methodName);
	}
}
