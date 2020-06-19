package basicDSProgrammes;

import java.nio.file.Files;
import java.nio.file.Path;

public class reverseArray {

	public static void main(String[] args) {
	Path path =Path.of("");
	boolean exist =Files.exists(path);
	System.out.println("Exist : "+ exist);
	}

}
