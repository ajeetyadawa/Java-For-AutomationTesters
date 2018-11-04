package javaexceptions;

public class Arrayexception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{int i[]= new int [4];
System.out.println("begining !!");
i[5]=100;
System.out.println("Ending!!");
	} catch(Exception e) {
		System.out.println("error occured");
	}
	}
}// 