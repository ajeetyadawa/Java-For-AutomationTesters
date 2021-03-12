package stringManipulation;

// https://leetcode.com/problems/implement-strstr/

public class implementIndexString {

	public static void main(String[] args) {
		String heystack = "aaaaa";
		String needle = "bba";
		System.out.println("Index: " + getIndexOf(heystack, needle));
		System.out.println("Method 2 Index: " + getIndexOf2(heystack, needle));

	}

	static int getIndexOf(String haystack, String needle) {
		int index = -1;
		char[] chStr = haystack.toCharArray();
		char[] subStr = needle.toCharArray();
		int testFlag = subStr.length;
		for(int i = 0; i < chStr.length-1; i++) {
			int check=0;
			for(int j = 0; j < testFlag-1; j++) {
				while (chStr[i] == subStr[j]) {
					check++;
				}
				if (testFlag == check) {
					index = i-2;
					break;
				}
			}

		}

		return index;
	}
	
	static int getIndexOf2(String haystack, String needle) {
		if(haystack.length()==needle.length()||haystack.contains(needle)||needle.length()==0) {
			return 0;
		}
		 return haystack.contains(needle)?haystack.indexOf(needle)-1:-1;
	}
}
