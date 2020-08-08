package day1;

public class swapNumbers {
/*
 * 
 */
public static void main(String[] args) {
		int a= 5;
		int b= 4;
		int temp =a;
		System.out.println("value of a : "+a +" value of b "+b);
		// Swap logic 1 
		a=b;
		b =temp;
		System.out.println("value of a : "+a +" value of b "+b);
		// Swap logic 2
		a =a+b;
		b = a-b;
		a= a-b;
		System.out.println("value of a : "+a +" value of b "+b);
		// Swap logic 3
		a= a*b;
		b=a/b;
		a=a/b;
		System.out.println("value of a : "+a +" value of b "+b);
		
	}

}
