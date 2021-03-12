package stringHanding;

import java.util.Scanner;

public class printPermutatonofString {

	public static void main(String[] args) {
	System.out.println("Printing String permutation of given String");
	System.out.println("Enter the word");
	Scanner sc = new Scanner(System.in);
	String word = sc.next();
	int len = word.length();
	Permutation permutation = new Permutation();
	permutation.permutate(word, 0, len-1);

	}

}
