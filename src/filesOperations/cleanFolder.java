package filesOperations;

import java.io.File;

public class cleanFolder {

	
	
	public static void main(String[] args) {
		String cleanUpFolderPath = "C:\\Users\\ajit\\iCloudDrive\\Resume";
		File file = new File(cleanUpFolderPath);
		File[] files = file.listFiles();
		for(File item: files) { item.delete();}

	}

}
