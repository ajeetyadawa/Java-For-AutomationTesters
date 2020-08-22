package VariableScope;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseVariable obj= new BaseVariable();
		//System.out.println(obj.privateVariable);// non accessible outside of class
		System.out.println(obj.protectedVariable);
		System.out.println(obj.publicVarible);
		System.out.println(obj.defaultVariable);

	}

}
