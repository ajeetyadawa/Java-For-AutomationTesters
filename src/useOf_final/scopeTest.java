package useOf_final;

import VariableScope.BaseVariable;

public class scopeTest{

	/*
	 * default access modifier can be accessed within package 
	 * Protected access modifier only accessed within package and  outside the package through child classes
	 * private access modifier only access within same class
	 * public access modifier available across project
	 * 
	 */
	
	public static void main(String[] args) {
	BaseVariable baseVariables = new BaseVariable();
	System.out.println("Accessed public varibale: "+baseVariables.publicVarible);
	

	}

}
