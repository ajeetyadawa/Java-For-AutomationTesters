package com.thoughtscoder.interviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class countDuplicateCharacters {

	public static void main(String[] args) {
		String word = "Satement";
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < word.length() - 1; i++) {
			char ch = word.charAt(i);
			if (map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, ++count);
			} else {
				map.put(ch, 1);
			}

		}
	}
}
