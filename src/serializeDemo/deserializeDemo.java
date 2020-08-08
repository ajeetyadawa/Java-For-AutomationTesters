package serializeDemo;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.HashMap;

public class deserializeDemo {

	public static void main(String[] args) {
		try {
		FileInputStream fis = new FileInputStream("data.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		HashMap<String, String> map = new HashMap<String, String>();
		map = (HashMap)ois.readObject();
		System.out.println("Deserialized HashMap "+map);
		} catch(Exception e) {
			
			e.printStackTrace();
		}

	}

}
