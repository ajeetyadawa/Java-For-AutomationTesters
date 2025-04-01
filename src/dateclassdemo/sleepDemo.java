package dateclassdemo;

import java.util.Date;

public class sleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {

	System.out.println(new Date());
	Thread.sleep(8000);

	System.out.println(new Date());
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
