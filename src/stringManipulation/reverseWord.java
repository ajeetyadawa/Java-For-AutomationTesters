package stringManipulation;

public class reverseWord {
public static String reveseWord(String word) {
	String words[]= word.split("\\s");
	String reverseWord ="";
	for (String w: words) {
		StringBuilder sb= new StringBuilder(w);
		sb.reverse();
		reverseWord+=sb.toString()+" ";
	}
	return reverseWord.trim();
}
}
