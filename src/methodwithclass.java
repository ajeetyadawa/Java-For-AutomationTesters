
public class methodwithclass {

	public static int display(int a, int b) {
		int c= a+b;
		return c;
	}
	public void show() {
		System.out.println("you are in show function");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	methodwithclass learn = new methodwithclass();
		learn.show();
		int y= learn.display(45, 45);
		System.out.println(y);
		methodwithclass learn1 = new methodwithclass();
		learn1.show();
		int c= learn1.display(43,56);
		System.out.println(c); 
	}*/
	Home_instance var = new Home_instance();
	var.z++;
	System.out.println(var.z);
	Home_instance var2= new Home_instance();
	--var2.z;
	System.out.println(var2.z);
	
}
}
