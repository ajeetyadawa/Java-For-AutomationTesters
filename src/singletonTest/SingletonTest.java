package singletonTest;

import static singletonTest.WebDriverSinglton.WebDriverSingltonInstance;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println(WebDriverSingltonInstance());
		System.out.println(WebDriverSingltonInstance());
	}

}
