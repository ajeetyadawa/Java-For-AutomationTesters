package stringHanding;

import java.util.HashSet;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "this is QA EduPoint";
System.out.println(s.length());  //size of String
// character at 10th Position
System.out.println(s.charAt(10));

for(int i=0;i<= s.length()-1; i++) {
	System.out.println(s.charAt(i));
}
for(int j=s.length()-1;j>0;j--) {
	System.out.println(s.charAt(j));
}
s.trim();

System.out.println(s.replace("this", "that"));   // replace this by that

// find index of character

System.out.println(s.indexOf("s"));// give first Index of String
System.out.println(s.lastIndexOf(" "));
// how to count unique character of 

HashSet <Character> set = new HashSet<Character>();
for (int k=0;k<s.length();k++) {
	set.add(s.charAt(k));
}
System.out.println(set);
System.out.println(set.size());
int count =0;
for(char eachChar: set) {
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)==eachChar) {
			count++;
					}
	}
	System.out.println("Char--->"+eachChar+"has Total occurance of -->"+count);
}

	}
	

}
