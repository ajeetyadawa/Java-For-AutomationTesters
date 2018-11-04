package javaexceptions;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	System.out.println("begining !!");
	int divide =10/0;
	System.out.println(divide);
System.out.println("ENDING");
	}catch(Exception e) {
		System.out.println("Error occured !! ");
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
System.out.println("After catch block!!");

}
	}
