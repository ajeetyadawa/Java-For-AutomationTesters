package day1;

import java.util.Scanner;

/*
 * Author- Ajeet
 * This program add the sum of digit of entered by user
 */
public class sumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	int num =sc.nextInt();
	//Home Java Code
	int sum =0;
	while(num>0) {
	int t= num%10;
	sum = sum+t;
	num =num/10;
	}
	System.out.println("Sum of Number: "+sum);
	}

}
