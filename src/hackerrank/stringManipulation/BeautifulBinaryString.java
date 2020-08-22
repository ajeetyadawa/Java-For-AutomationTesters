package hackerrank.stringManipulation;

import java.util.Scanner;




public class BeautifulBinaryString {

	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number!");
		String inputBinaryStream = sc.next();
		sc.close();
		
		System.out.println("Minimum number of bit changed- "+beautifulStringFormater(inputBinaryStream));
	}
	public static int beautifulStringFormater(String binNum) {
		int swapCount=0;
		swapCount=binNum.length() - binNum.replace("010", "01").length();
		return swapCount;
	}
	
	
}
