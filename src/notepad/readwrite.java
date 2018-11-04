package notepad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class readwrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file = new File("C:\\Users\\ajit\\Google Drive\\test.txt");
file.createNewFile();
FileWriter fw= new FileWriter("C:\\Users\\ajit\\Google Drive\\test.txt");
BufferedWriter filewriter = new BufferedWriter(fw);
filewriter.write("Please write inside file");
filewriter.newLine();
filewriter.write("this is my second line");
filewriter.flush();
	}

}
