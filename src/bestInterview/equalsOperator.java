package bestInterview;

public class equalsOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = new String("abc");
String str2 = new String("avc");
if(str1==str2) {
	System.out.println("Equality result: true");
}
else 
	System.out.println("equality sign failed");
// Lets try with value
String str3= "abc";
String str4= "abv";
String str5= new String(str1);
if(str3.equals(str4)) {
	System.out.println("Equals method true");
}
else
	System.out.println("equals method getting failed");
/*if(str5.equals(str1)) {
	System.out.println("equals method true for str 5");
}*/
 if(str5==str1) {
	System.out.println("equals operator getting failed!!");
}
	
}
	
}
