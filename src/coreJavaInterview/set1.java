package coreJavaInterview;

import java.util.Scanner;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Q1:  find number string from alphanumeric string
		String str= "hjsdafgjsdfdsa77517jadjdg2375775321";
		String numONly= str.replaceAll("[^0-9]", "");
		System.out.println(numONly);
		
//Q2: Calculate Fibnoacci Series
		System.out.println("Enter a number to Calculate Fibonacci series:\t ");
		int num= new Scanner(System.in).nextInt();
		System.out.println("fibonacci series will calculated upto"+num+"\t number");
		for(int i=0;i<=num;i++) {
			System.out.println(fibonacii(i)+" ");
			
			
		}
		for(int m=0;m<=num;m++) {
			System.out.println(fibonacii2(m)+" ");
			
			
		}
				
	}
public static int fibonacii(int j) {
	if(j==1||j==2) {
		return 1;
	}
	else
	return fibonacii(j-1)+ fibonacii(j-2);
}


public static int fibonacii2(int j) {
	if(j==1 || j==2) {
		return 1;
	}
	int f1=1,f2=1;
	int fibonacii =1;
	for(int l=3;l<=j; l++) {
		f1= f2;
		f2=fibonacii;
	}
	return fibonacii;
	
}
}

