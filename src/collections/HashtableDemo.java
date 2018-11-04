package collections;

import java.util.Hashtable;

public class HashtableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable h = new Hashtable();
Hashtable h1 = new Hashtable();
h.put(0, "QA");
h.put(1, "Tutor");
h.put(2, "EduPoint");
h.put(3, "India");
h.put(5, "NewDelhi");
h.put(4, "Saket");
h.put(6, "Best Coaching");
h.put(7, "Master of Java");
System.out.println("Values of h"+h);
h1= (Hashtable)h.clone();
System.out.println("Values of h"+h1);
h.clear();
System.out.println("after clearing"+h);
if(h1.contains("QA")) {
	System.out.println("QA object available");
}
}
}
