package fileSystems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class writingFiles {

	public static void main(String[] args) throws FileNotFoundException {
	 
			FileReader reader = new FileReader("C:\\Users\\ajit\\Desktop\\sample.txt");
			Scanner sc = new Scanner(new File("C:\\Users\\ajit\\Desktop\\sample.txt"));
			StringBuilder sb = new StringBuilder();
			while(sc.hasNext()) {
				sb.append(sc.next());
			}
			doTest(sc.toString());
		String sampleText= "This is AJeet Yadavgjskkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
		doTest(sampleText);
		

	}
public static void doTest(String text) {
	long start = System.currentTimeMillis();
	for(int i=0; i <=99799880; i++) {
	String result = text.toUpperCase();
	}
	long end = System.currentTimeMillis();

	System.out.println("Total Time Taken:"+(end-start));
}
}
