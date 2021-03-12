package java8Stream;

import java.util.ArrayList;
import java.util.List;

public class streamExample {

	public static void main(String[] args) {
		List<Integer> numberList = new ArrayList<Integer>();
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
		System.out.println("Sum of Greatest Number: " + getSumGreaterNumbers(numberList));

	}

	public static int getSumGreaterNumbers(List<Integer> numberOfList) {
		return 0;// numberOfList.stream().filter(i->i>5).map(i->i).c;
			
		
	}
}
