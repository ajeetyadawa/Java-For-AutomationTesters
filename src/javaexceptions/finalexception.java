package javaexceptions;


public class finalexception {
	public static void main(String[] args) {
		final int x=100; // final keyword is used with any varibale then itcant be changed.
	//	x=200;
		try {
			// DB Connection 
			// Executing some queries 
			// validating the data and comparing from websites
			// closing connections
		}catch(Exception e) {
			System.out.println("Error occured !!");
		}finally {
			System.out.println("Closing the DB Connection in finally Block!!");
		}
	}
}
