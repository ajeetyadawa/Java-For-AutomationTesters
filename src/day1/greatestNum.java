package day1;

public class greatestNum {
/*
 * This program is created to find highest number from given three number.
 */
	public static void main(String[] args) {

		int a = -93;
		int b =55;
		int c = 55;

		if (a > b && a > c) {
			System.out.println("A is greatest Number: "+a);
		}
		else if(b>c && b> a) {
			System.out.println("B is greatest Number: "+b);
		}
		else {
			System.out.println("C is greatest Number: "+c);
		}
	}

}
