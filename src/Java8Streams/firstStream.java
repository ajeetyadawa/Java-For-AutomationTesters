package Java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class firstStream {

	public static void main(String[] args) {
		List<String> students = new ArrayList<String>();
		students.add("Ajeet");
		students.add("Ajit");
		students.add("Neerav");
		Stream<String> stream = students.stream();
		
		long count = stream
				.map((value)->{return value.toLowerCase();})
				.count();
System.out.println("Count of List stream: "+count);
}
}
