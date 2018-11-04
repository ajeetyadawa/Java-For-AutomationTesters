package package3;

public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj= new test();
		//System.out.println(obj.privateVariable);// non accessible outside of class
		System.out.println(obj.protectedVariable);
		System.out.println(obj.publicVarible);
		System.out.println(obj.defaultVariable);

	}

}
