package coreJavaInterview;

public class equals {
/*
 *   == comparision of obejct reference
 *   equals - comapre the content
 * 
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name1= "Ajeet";
String name2 = "Ajeet";
System.out.println(name1 == name2);
System.out.println(name1.equals(name2));

System.out.println("see below result");
String name_1 = new String("Ajeet");
String name_2 = new String("Ajeet");
System.out.println(name_1==name_2);
System.out.println(name_1.equals(name_2));
	}

}
