package constructor;

public class constructor_Demo {
	private int num = 1;
	protected boolean flag;

	public constructor_Demo() {
	 new constructor_Demo(4); // what if new Test(4) changed to this(4)-- 
		//pls debug and explore reason. FYI- there is some trick, i did
	//	this(4);
	//	flag = true;
	}

	public constructor_Demo(int num) {
		this.num = num;//flag ? num : num + 1;
	}
	
	
	public static void main(String[] args) {
		System.out.print(new constructor_Demo().num);

	}

}
