package notepad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NotepadWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
File file = new File("C:\\Users\\ajit\\Desktop\\Automation\\note.txt");
file.createNewFile();
FileWriter filewrite = new FileWriter("C:\\Users\\ajit\\Desktop\\Automation\\note.txt");
BufferedWriter writer = new BufferedWriter(filewrite);
writer.write("Writing inside in notepad");
writer.newLine();
writer.write("writing in 2nd line");
writer.newLine();
writer.write("writing in 3rd line");
writer.flush();
// java program to read text from file
FileReader filereader= new FileReader("C:\\Users\\ajit\\Desktop\\Automation\\note.txt");
BufferedReader reader = new BufferedReader(filereader);

System.out.println(reader.readLine());
System.out.println(reader.readLine());
System.out.println(reader.readLine());


	}

}
