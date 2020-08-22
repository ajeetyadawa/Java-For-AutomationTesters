package hackerrank.stringManipulation;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		System.out.println("Enter the number of test cases");
		Scanner sc = new Scanner(System.in);
		int testCaseCount = sc.nextInt();
		while(testCaseCount>0) {
			System.out.println("Enter the number for power calculation: ");
			int num= sc.nextInt();
			System.out.println("Enter the number for power calculation: ");
			int pow = sc.nextInt();
			try { 
				System.out.println("Calculated power : "+powerCalculator(num,pow));
			}catch( Exception e) {
				System.out.println(e);
			}
			--testCaseCount;
		}

	}
public static int powerCalculator(int n, int p) throws Exception {
	if(n<0||p<0) {
		throw new Exception("n or p should not be negative");
	}
	else if(n==0 && p==0) {
		throw new Exception("n and p should not be zero");
	}
	else {
		return (int)Math.pow(n, p);
	}
}
}
