package hashmapDemo;

import java.util.HashMap;
import java.util.Map;

public class demo1 {

	public static void main(String[] args) {
		Map<String, String> userDetails = new HashMap();
		userDetails.put("userName", "Soumya");
		userDetails.put("Age", "26");
		userDetails.put("City", "Pune");
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
		userDetails2.put("MobileNumber", "95555");
		
		System.out.println("User 2 user Age : "+userDetails2.get("Age"));
		System.out.println("User 2 user City : "+userDetails2.get("City"));
		
		
	}

}
