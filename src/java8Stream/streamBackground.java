package java8Stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Before Java 8 - To find the greatest number from any list we need to iterate over 
 * List and compare. This program shows the Java7 Approach
 * This code is to find the sum of all integers which are greater than 5
 */
public class streamBackground {

	public static void main(String[] args) {
		List<Integer> numberList= new ArrayList<Integer>();
		numberList.add(1); 
		numberList.add(2); 
		numberList.add(3); 
		numberList.add(4); 
		numberList.add(5); 
		numberList.add(6); 
		numberList.add(7); 
		numberList.add(8); 
		numberList.add(9); 
		numberList.add(10); 
		System.out.println("Sum of Greatest Number: "+getSumofGreaterNumbers(numberList));
		
	}
public static Integer getSumofGreaterNumbers(List<Integer> nums) {
	Iterator<Integer> num = nums.iterator();
	int sum=0;
	while(num.hasNext()) {
		int n= num.next();
		if(n>5){
			sum +=n;
		}
		
	}
	
	return sum;
}
}
