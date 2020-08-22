package hackerrank.stringManipulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class devideByZero {

	public static void main(String [] args) {
		System.out.println("Enter the number of test cases");
		Scanner sc = new Scanner(System.in);
		int testcaseCount = sc.nextInt();
		while(testcaseCount>0) {
			System.out.println("Enter numbers to be devide");
			try {	int x = sc.nextInt();
			int y = sc.nextInt();
			
				System.out.println(x/y);
			}catch(InputMismatchException e) {
				System.out.println(e.getClass().getName());
				
			}catch(ArithmeticException e) {
				System.out.println(e.getClass().getName()+ " : / by zero");
			}
			
			
			testcaseCount--;
		}
	}
	
	
	
	
	
}
