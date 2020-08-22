package hackerrank.stringManipulation;

import java.util.Scanner;

/*
 *This program is Hackerarnk practice 
 *Question - print the count of Characters which deleted to print alternate Characters.
 */
public class AlternateCharater {

	
	
	public static void main(String[] args) {
	System.out.println("***********Enter the number of Test Cases**************");
	Scanner scan = new Scanner(System.in);
	int testCaseCount= scan.nextInt();
	while(testCaseCount>0) {
		String word = scan.next();
		System.out.println("Minimum deletion: "+deleteCharactersCount(word));
	}
	
	

	}

	public static int deleteCharactersCount(String word) {
		int count =0;
		int wordLength = word.length();
		for(int i =1; i<wordLength;i++) {
			if(word.charAt(i)==word.charAt(i-1)) {
				count++;
			}
			
	}
	return count;
}
}
