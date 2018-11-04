package package3;

public class test {

	public int publicVarible=10;
	private int privateVariable=20;
	protected int protectedVariable=30;
	int defaultVariable=40;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test obj= new test();
		System.out.println(obj.privateVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.publicVarible);
		System.out.println(obj.defaultVariable);

	}

}
