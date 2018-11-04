package listExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class listDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> l1 = new ArrayList<Integer>();
l1.add(5);
l1.add(7);
l1.add(98);
l1.add(17);
l1.add(3);
System.out.println(l1);
l1.add(0,1);
System.out.println("At O index 1 added"+l1);
l1.remove(4);
System.out.println("Index 4th Element removed"+l1);
l1.add(3,99); // added 99 at 3rd index
// sublist creation 
List <Integer> l2= new ArrayList<Integer>();
List <Integer> l3= new ArrayList<Integer>();
l2= l1.subList(1, 3);
System.out.println("List 1:"+l1);
System.out.println("List 2: "+l2);
if (l3.isEmpty()) {
	System.out.println("Empty list");
	System.out.println("Size of L3 list\t"+l3.size());
	System.out.println("Size of L3 list\t"+l2.size());
	System.out.println("Size of L3 list\t"+l1.size());
}
else
	System.out.println("list is not empty");
if(l1.contains(1))
{
	System.out.println("List 1 have list 2 objects");
}
else
System.out.println("No objects are no commons");
Iterator<Integer> irt = l1.iterator();
while(irt.hasNext()){
	System.out.println(irt.next());

}

}}
