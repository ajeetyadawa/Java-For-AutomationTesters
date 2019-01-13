package Collection_CoreJava_reference;

import java.util.LinkedList;

public class linkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ls= new LinkedList<String>();
ls.add("fIRST");
ls.add("Second");
ls.add("third");
ls.add("fourth");
ls.add("fifth");
System.out.println("Linked List Size-->"+ls.size());
System.out.println(ls.indexOf("fIRST"));
System.out.println("Linked List before deletion"+ls);
ls.remove(1);
System.out.println("Linked List after deletion"+ls);
ls.addFirst("todeletete");
ls.addLast("lastto Delete");
System.out.println(ls+"--> these are items added from both end");
// remove from first and last
ls.removeLast();
ls.removeFirst();
System.out.println("After Deletion of element"+ls);
// get value of LinkedList
String data= ls.get(3);
System.out.println(data);
// update value of list data 
System.out.println(ls);
ls.set(3, "QA EduPoint");
System.out.println(ls);















	}

}
