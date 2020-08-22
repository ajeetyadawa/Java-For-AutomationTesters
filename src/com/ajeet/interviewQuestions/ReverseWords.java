package com.ajeet.interviewQuestions;

public class ReverseWords {

	/*
	 * This is the one of the frequent interview questions
	 * Original String "How are you"
	 * Converted String "woH era uoy"
	 * 
	 */
	
	
	public static void main(String[] args) {
		String originalString = "How are you";
		String [] words = originalString.split("\\s+");
		String reverseWords ="";
		for(String word: words) {
			int count= word.length();
			String tempWord="";
			for(int i =count-1; i>=0;i--) {
				tempWord =tempWord+word.charAt(i);
			}
			reverseWords= reverseWords+tempWord+ " ";		
			
		}
			System.out.println("Reversed word: "+reverseWords);	
		
	

	}

}
