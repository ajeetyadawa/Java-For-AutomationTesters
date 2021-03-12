package superDemo;

public class childClass extends parentClass {

	childClass(){
		super();
		System.out.println("ChildClass constructor is executing");
		
	}
	
	public void displayChildClass() {
		System.out.println("Displaying Parent Class variable: "+super.fanSpeed);
		super.display();
	}
}
