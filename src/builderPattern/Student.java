package builderPattern;

public class Student {
	
	private int rollNumber;
	private String name;
	private  String address;
	
	public Student setId(int rollNumber) {
		this.rollNumber=rollNumber;
		return this;
	}
	
	public Student setName(String name) {
		this.name=name;
		return this;
	}
	
	public Student setAddress(String address) {
		this.address=name;
		return this;
	}
	
	@Override
	public String toString() {
		return " id= " +this.rollNumber+" , name="+this.name+ ", address "+this.address;
	}

}
