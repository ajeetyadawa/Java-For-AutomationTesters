package serializationDesrialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private String serializeValueName;
	private transient int nonSerializeValueSalary;

	public String getSerializeablevaleName() {
		return serializeValueName;
	}

	public void setSerializeablevaleName(String serializeValueName) {
		this.serializeValueName = serializeValueName;
	}

	public int getNonSerializeValueSalary() {
		return nonSerializeValueSalary;
	}

	public void setNonSerializeValueSalary(int nonSerializeValueSalary) {
		this.nonSerializeValueSalary = nonSerializeValueSalary;
	}

	@Override
	public String toString() {
		return "Employee [serializeValueName=" + serializeValueName + "]";
	}
}
