package Collection_CoreJava_reference;

import java.util.ArrayList;

public class arrayListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> arry= new ArrayList<Integer>();
arry.add(1);
arry.add(2);
arry.add(3);
arry.add(4);
System.out.println("Array List Capacity-->"+arry.size());
arry.ensureCapacity(21);
System.out.println("Array List Capacity-->"+arry.size());
System.out.println("Contents of arrayList"+arry);
Integer [] ia= new Integer[arry.size()];
ia= arry.toArray(ia);
int sum=0;
		for(int i :ia) sum+=i;
			System.out.println("Sum is: "+sum);
		
	}
}


