package typecaste;

import java.util.function.DoubleToIntFunction;

public class convert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i= 57;
int j= 76;
System.out.println(i);
//char ch= i ; // it will not work
// convert integer into character
char ch = (char)i;
System.out.println(ch);
String ch1= Integer.toString(i);
System.out.println(ch1);
float lf = (float)i;
System.out.println(lf);
double db= (double)lf;
System.out.println(db);
//int j= String.valueOf(ch);
	}

}
