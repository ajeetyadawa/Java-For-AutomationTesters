package abstractDemo;

public class Childclass extends Base {

	public static void main(String[] args) {
		// Make object of Child Class to use implemented abstract class
		Childclass child = new Childclass();
		child.sum(3,4);
		child.subtract(5,1);
		// method which implemented in Base class
		child.displayMessage();

	}

	@Override
	void sum(int a, int b) {
		int c = a+ b;
		System.out.println("Sum method implmented here: "+c);
		
	}

	@Override
	void subtract(int a, int b) {
		int c = a- b;
		System.out.println("subtract method implmented here: "+c);
		
	}

}
