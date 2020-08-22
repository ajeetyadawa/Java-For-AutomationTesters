package hackerrank.stringManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class checkAnagram {

	public static void main(String[] args) {
		System.out.println("Enter number of test cases:-");
		Scanner sc = new Scanner(System.in);
		int testCaseCount = sc.nextInt();
		while (testCaseCount > 0) {
			System.out.println("Enter word to test anagram");
			String word1 = sc.next();
			String word2 = sc.next();
			System.out.println("is word : "+word2+" and  "+word1+" Anagram: "+isAnagram(word1, word2));
			
			testCaseCount--;
		}

	}

	private static boolean isAnagram(String word1, String word2) {
		boolean isAnagram= false;
		if(word1.length()!=word2.length()) {
			return isAnagram;
		}
		char [] a1 = word1.toLowerCase().toCharArray();
		char [] a2 = word2.toLowerCase().toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		return Arrays.equals(a1, a2);
	}

}
