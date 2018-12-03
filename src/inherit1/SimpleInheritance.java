package inherit1;

public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A superob = new A();
B subob = new B();
System.out.println("Contents of superob: ");
subob.i=7;
subob.j=9;
subob.k=11;
subob.showk();
subob.showij();
System.out.println();
System.out.println("Sum of i j and k in subOb: ");
subob.sum();
	}

}
