package stringHanding;

public class getIdfromText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "this is your pre registartin number ncvxsfggf Please :aaaaaaaaaddddd8555. tetwehbscbcbsbcbcb";
System.out.println(s.indexOf(":"));
System.out.println(s.substring(33));
System.out.println(s.substring(s.indexOf(":")+1));
int indexofColon =s.indexOf(":");
int indexOfFullStop =s.indexOf(".");
System.out.println(s.indexOf(":"));
System.out.println(indexOfFullStop);
System.out.println(s.indexOf("Please"));
String [] splittedString = s.split("5");
for(String ss:splittedString) {
	System.out.println();
}
	
	}

}
