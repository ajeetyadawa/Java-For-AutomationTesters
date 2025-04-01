package dateclassdemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateFormatter {

	public static void main(String[] args) {
		Date date = new Date();
SimpleDateFormat ft = new SimpleDateFormat("d/m/y");
System.out.println(ft.format(date));

	}

}
