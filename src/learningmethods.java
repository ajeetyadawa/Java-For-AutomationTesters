
public class learningmethods {

	public static int a=234;
	public static int b=354;
	public static void addNumbers() {
		int c;
		c=a+b;
		System.out.println(c);
	}
	public static void print() {
		System.out.println("Learning Functions");
	}
	
	public static int addNumbers(int r, int s) {
		int add =r +s;
		System.out.println("addition  of two numbers"+add);
		return add;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
print();
addNumbers();
int result= addNumbers(30,49);

System.out.println(result);

	}

}
