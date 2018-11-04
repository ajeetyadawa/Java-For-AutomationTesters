package collections;
import java.util.ArrayList;
import java.util.*;
import java.lang.*;
import java.io.*; 
public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList list = new ArrayList();
System.out.println(list);
System.out.println("size of list"+list.size());
		list.add(10); // number 10 converted into object. Automboxing happening
		list.add("QA EduPoint");
		list.add(10.25);
		list.add('c');
		System.out.println(list);
		System.out.println("size of list"+list.size());
		list.add(true);
		list.add(null);
		list.add(10);
		System.out.println(list);
		System.out.println("size of list"+list.size());
		// how to fetch values from ArrayList
	System.out.println("this is the way to fetch value from array list"+list.get(0));// it is not returning value . it returns class
	System.out.println("this is the way to fetch value from array list"+list.get(list.size()-1));
	System.out.println("this is the way to fetch value from array list"+list.get(5));
	// how to remove Values from ArrayList\
    //list.remove(7);
	System.out.println(list);
	System.out.println("size of ArrayList\t"+list.size());
	// way to print values from ArrayList
	// first way
	for(int l=0; l<=list.size()-1;l++) {
	//	System.out.println(list.get(l));
	System.out.println("print the value of "+l+"th item"+ list.get(l));
	} 
	// 2nd way
	for(Object var: list) {
		System.out.println(var);
	}
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println("print list Iteration:\t"+itr.next());
		
	// drawaback of ArrayList
		int var1=(Integer) list.get(0);  // when we dont know about object type
		System.out.println(var1+20);
		
		
	}
	}

}
