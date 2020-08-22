package useOf_final;

import VariableScope.BaseVariable;

public class testProtectedoutsidePackage extends BaseVariable {

	public static void main(String[] args) {
		BaseVariable baseVariable = new BaseVariable();
		System.out.println("Accessed public varibale: "+baseVariable.publicVarible);
		//System.out.println("Accessed public varibale: "+baseVariable.publicVarible);
	}

}
