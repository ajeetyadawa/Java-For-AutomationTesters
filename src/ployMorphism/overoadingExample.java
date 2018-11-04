package ployMorphism;

public class overoadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overoadingExample obj = new overoadingExample();
		obj.add(3, 5);
		obj.add(4, 5, 6);
		obj.doLogin(8130735, "Ajeet");
		obj.doLogin("8130735", "Kumar");
		obj.addition(1,2,3,4,5);
		
	}
public void add(int a, int b) {
	System.out.println("Adding two numbers");
}
public void add(int a, int b, int c) {
	System.out.println("Adding three numbers");
}
public void doLogin(String username, String password) {
	System.out.println("user login through username");
}
public void doLogin(int  mobile, String password) {
	System.out.println("user login through mobileNumber");
}
public void addition (int ...a) {
	int[] var;
	
}
}
