package hashmapDemo;

import java.util.HashMap;
import java.util.Map;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer, Map<String, String>> students= new HashMap<Integer, Map<String, String>>();
Map<String, String> student1 = new HashMap<String, String>();
student1.put("Name", "Ajeet");
student1.put("Age", "25");
student1.put("City", "Noida");
students.put(1, student1);
System.out.println("Student 1 Details: "+student1);
Map<String, String> student2 = new HashMap<String, String>();
student2.put("Name", "Soumya");
student2.put("Age", "25");
student2.put("City", "Pune");
System.out.println("Student 2 Details: "+student2);
students.put(2, student2);
Map<String, String> student3 = new HashMap<String, String>();
student3.put("Name", "Ravi");
student3.put("Age", "25");
student3.put("City", "Bng");
System.out.println("Student 3 Details: "+student3);
students.put(3, student3);
System.out.println("Students Details: "+students);

System.out.println("Roll no 1 City Name: "+ students.get(3).get("Name"));

	}

}
