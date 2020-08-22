package hackerrank.stringManipulation;

import java.util.Scanner;

public class caesarCipher {

	public static void main(String[] args) {
		System.out.println("Enter String which you wat encrypt");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int key = 3;
		System.out.println("Encrypted word: " + encryptedWord(word, key));
	}

	private static String encryptedWord(String word, int key) {
		StringBuilder sb = new StringBuilder();
		char[] words = word.toCharArray();

		for (int i = 0; i < word.length(); i++) {
			sb.append(encrypt(words[i], key));

		}
		return sb.toString();
	}

	private static char encrypt(char ch, int key) {
		if (!Character.isLetter(ch)) {
			return ch;
		}

		char base = Character.isLowerCase(ch) ? 'a' : 'A';
		return (char) ((ch - base + key) % 26 + base);
	}

}
