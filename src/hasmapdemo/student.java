package hasmapdemo;

import java.util.HashMap;
import java.util.Map;

public class student {

	public static void main(String[] args) {
		Map<String, String> userDetails = new HashMap();
		userDetails.put("userName", "Animesh");
		userDetails.put("Age", "26");
		userDetails.put("City", "Ballia");
		userDetails.put("MobileNumber", "815000");
		String userName= userDetails.get("userName");
		System.out.println("userName "+ userName);
		String age = userDetails.get("Age");
		System.out.println("user Age : "+age);
		String city = userDetails.get("City");
		System.out.println("user City : "+city);
		
		Map<String, String> userDetails2 = new HashMap();
		userDetails2.put("userName", "Ajeet");
		userDetails2.put("Age", "26");
		userDetails2.put("City", "Delhi");
		userDetails2.put("MobileNumber", "9555902032");
		System.out.print("Is hashMap have Key"+userDetails2.containsKey("Age"));
		System.out.println("is HashMap Empty"+userDetails2.isEmpty());
		System.out.println("User 2 user Age : "+userDetails2.get("Age"));
		System.out.println("User 2 user City : "+userDetails2.get("City"));
	//userDetails2.remove("userName");
		//System.out.println("User 2 details without "+userDetails2.get("userName"));
	//	userDetails2.clear();
		userDetails2.replace("userName", "Amit");
		System.out.println("User 2 details"+userDetails2);
	}

}
