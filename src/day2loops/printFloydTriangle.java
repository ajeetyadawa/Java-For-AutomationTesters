package day2loops;

import java.util.Scanner;

public class printFloydTriangle {

	public static void main(String[] args) {
	
		System.out.println("************Welcome to Flyod Traingle ***************");
		System.out.println("How many row you want to  print? ");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		printFloydTriangle(num);
	}
public static void printFloydTriangle(int num) {
	int number =1;
	for(int i =1 ; i<=num; i++) {
		for(int k =1; k<=i; k++) {
			System.out.print(number +" ");
			number++;
		}
		System.out.println("\n");
	}
}
}
