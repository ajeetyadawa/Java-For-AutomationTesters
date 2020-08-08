package serializeDemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class hashmapSerialize {

	public static void main(String[] args) {
	HashMap<String, String>  data= new HashMap<String, String>();
	data.put("Name", "Aniket");
	data.put("Class", "B.Tech");
	data.put("Subject", "CSE");
	data.put("Address", "Lucknow");
	System.out.println("Data to be saved: "+data);
	try {
	FileOutputStream fos = new FileOutputStream("data.ser");
	ObjectOutputStream oos = new ObjectOutputStream(fos);
	oos.writeObject(data);
	oos.close();
	fos.flush();
	System.out.println("Output is saved in data.ser");
	}catch(Exception e) {
		e.printStackTrace();
	}

	}

}
