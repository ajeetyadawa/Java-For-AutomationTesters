
public class methodwithparameter {

	public static int display(int a, int b , int c) {
		int z= a+b+c;
		System.out.println("We are in Display Function");
		return z;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("We are in Main Programme");
int a,b,c;
a=23;
b=34;
c=56;
int y= display(a,b,c);
System.out.println(y);	
		
		
	}

}
