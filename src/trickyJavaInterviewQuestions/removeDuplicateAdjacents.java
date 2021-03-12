package trickyJavaInterviewQuestions;

/*
 * Write a java program to remove adjacent 
 */

public class removeDuplicateAdjacents {

	public static void main(String[] args) {
		String givenString = "jjadcvxxggdgddg";
		System.out.println("After Removing duplicate characters: " + remove(givenString));
	}

	public static String removeDuplicate(String str, char lastRemoved) {
		
		if (str.length() == 0 || str.length() == 1) {
			return str;
		}
		if (str.charAt(0) == str.charAt(1)) {
			lastRemoved = str.charAt(0);
			while (str.length() > 1 && str.charAt(0) == str.charAt(1))
				str = str.substring(1, str.length());
			str = str.substring(1, str.length());
			return removeDuplicate(str, lastRemoved);
		}
		String rem_str = removeDuplicate(str.substring(1, str.length()), lastRemoved);
		if (rem_str.length() != 0 && rem_str.charAt(0) == str.charAt(0)) {
			lastRemoved = str.charAt(0);
			return rem_str.substring(1, rem_str.length()); // Remove first character
		}

		if (rem_str.length() == 0 && lastRemoved == str.charAt(0))
			return rem_str;

		// If the two first characters of str and rem_str don't match,
		// append first character of str before the first character of
		// rem_str
		return (str.charAt(0) + rem_str);
	}

	static String remove(String str) {
		char last_removed = '\0';
		return removeDuplicate(str, last_removed);
	}

}
