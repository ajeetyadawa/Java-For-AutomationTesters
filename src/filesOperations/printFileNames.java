package filesOperations;

import java.io.File;

/*
 * This program categories the files of given folder  into File, directory and hidden.
 * Also print on console.
 * written on 10 August    
 */



public class printFileNames {

	public static void main(String[] args) {
		String filePath= "C:\\Users\\ajit\\Desktop\\Chinees";
		File file = new File(filePath);
		
		File[] files = file.listFiles();
		for(File f: files) {
			if(f.isDirectory()) {
				System.out.println(f.getName()+" is directory !");
			}
			else if(f.isFile()) {
				System.out.println(f.getName()+" is file !");
			}
			else if(f.isHidden()) {
				System.out.println(f.getName()+" is hidden file !");
			}
			
		}

	}

}
