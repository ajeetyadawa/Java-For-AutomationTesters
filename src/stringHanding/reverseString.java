package stringHanding;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String t= "whatyoudo";
for(int i=0; i<t.length();i++) {
	System.out.println("Printing string:\t"+t.charAt(i));
}
System.out.println("printing string in reverse order");
for(int h=t.length();h>0;h--) {
	System.out.println(t.charAt(h));
}

 
	} 

}
