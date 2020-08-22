package Java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class filterStream {

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		students.add("Ajeet");
		students.add("Ajit");
		students.add("Neerav");
		students.add("Neerav");
		students.add("Ajeet");
		students.add("ahhs");
		students.add("fdfdfdddfd");
		Stream<String> stream = students.stream();
		Stream<String> longStringsStream = stream.filter((value) -> {
		    return value.length() >= 3;
		});
        		 
	}

}
