package com.ajeet.interviewQuestions;

public class ReverseWordByWord {

	/*
	 * Write a Java program which inverts word by word
	 * Input string: "This is Ajeet Yadav"
	 * Output String: "Yadav Ajeet is This"
	 */
	
	
	public static void main(String[] args) {
	 String givenString = "This is Ajeet Yadav";
	 String [] words= givenString.split("\\s+");
	 StringBuffer sb = new StringBuffer();
	 for(int i=words.length-1; i>=0;i--) {
		 sb.append(words[i]).append(" ");
	 }
	 System.out.println("Original String: "+givenString);
     System.out.println("Reversed String: "+sb.toString());
	}

}
