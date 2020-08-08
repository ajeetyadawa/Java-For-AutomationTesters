
public class calculator {
	
private int num1;
private int num2;
public calculator(int num1, int num2) {
	this.num1= num1;
	this.num2 =num2;
	
}
	
	
public int getsum() { // parameters 
	int result = num1 +num2;
	return result;
}
public int getsubtract() {
	int result = num1 -num2;
	return result;
}
public int getmultiply() {
	int result = num1 *num2;
	return result;
}
public int getdiv() {
	int result = num1 /num2;
	return result;
}
public static void main(String [] args) {
	int no1= 10;
	int no2=5;
	calculator cl= new calculator(no1, no2);
	System.out.println("Sum of Numbers: "+cl.getsum());
	System.out.println("Multiplication of Numbers: "+cl.getmultiply());
	System.out.println("Subtract of Numbers: "+cl.getsubtract());
}
}
