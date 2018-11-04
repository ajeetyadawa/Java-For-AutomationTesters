package collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mapExample {
public static void main(String[] args) {
Map <String, String> map = new HashMap<String, String>();
map.put("firstName","QAEdupoint");
map.put("lastName","Analytical");
System.out.println(map);
map.put("location","Saket, Delhi");
map.put("State","Uttar Pradesh");
System.out.println(map);
System.out.println(map.size());
Set <String> keys= map.keySet();
for(String key: keys) {
System.out.println("Keys---->"+key+" Value  is --->"+map.get(key));
}
Map <String, List <String>> map1 = new HashMap<String, List <String>>();
List<String> listofEmails = new ArrayList<String>();
listofEmails.add("sqt.trainer@gmail.com");
listofEmails.add("sqt.trainer@gmail.com");
listofEmails.add("info@analyticaleducation.com");
System.out.println(listofEmails);
	}
}
