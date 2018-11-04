package collections;
import java.util.ArrayList;
import java.util.List;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> list = new ArrayList<Integer>();
list.add(10);
list.add(null); // null can be added everywhere in list either list type is Integer or Float
//list.add(10.25);// As array list is 
list.get(0);
int i= list.get(0);
System.out.println(10+i);
	}

}
