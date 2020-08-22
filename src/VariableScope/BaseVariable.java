package VariableScope;

public class BaseVariable {

	public int publicVarible=10;
	private int privateVariable=20;
	protected int protectedVariable=30;
	int          defaultVariable=40;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseVariable obj= new BaseVariable();
		System.out.println(obj.privateVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.publicVarible);
		System.out.println(obj.defaultVariable);

	}

}
