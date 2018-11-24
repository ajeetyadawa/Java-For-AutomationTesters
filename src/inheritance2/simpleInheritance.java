package inheritance2;

public class simpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.print(System.currentTimeMillis());
A superob = new A();
B supOb = new B();
superob.i=10;
superob.j=20;
// use of superclasss
System.out.println("Contents of superOb: ");
superob.showij();
System.out.println();
// The subclass has access to all public members of superclass
supOb.i=7;
supOb.j=9;
supOb.k=8;
supOb.showij();
supOb.showk();

System.out.println("Sum of i,j and k in subOb: ");
System.out.println(System.currentTimeMillis());

	}

}
