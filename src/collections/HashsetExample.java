package collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {
public static void main(String [] args) {
	
Set <String> set = new HashSet<String>();
set.add("Automation");
set.add("Selenium");
set.add("QA Edupoint");
set.add("Automation");  // set list doest not store duplicate
System.out.println(set);
/*for(int i= 0; i<set.size(); i++) {
	System.out.println(set);
}*/
// how we can retrieve values using Set
for(String var: set) {
	System.out.println("print values using ForEach:\t:"+var);
}
Iterator <String> itr = set.iterator();
while(itr.hasNext()) {
	System.out.println("print values using iterator:\t:"+itr.next());
}
// how to print specific object// itr. next() jumps next on next value 
Iterator <String> itr1 = set.iterator();
if(itr1.next().equals("Automation")) {
	System.out.println(itr1.next());
}

Iterator <String> itr2 = set.iterator();
String var2 = itr2.next();

if(var2.equals("Automation")) {
	System.out.println(var2);
}
}
}
