package trickyJavaInterviewQuestions;

import java.util.Scanner;

public class checkPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num, revnum, rem=0;
		int  temp=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input number: ");
		num= sc.nextInt(); //. accept keyboard input
		revnum= num;
		while (num >0) {
			rem= num%10;
			temp= temp*10+rem;
			num = num/10;
		}
		if (temp==revnum) {
			System.out.println("Given Number is Palindrome");
			
		}
		else
			System.out.println("Given number is not Palindrome");
		
	}

}
