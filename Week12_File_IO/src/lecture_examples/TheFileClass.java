package lecture_examples;

import java.io.File;

public class TheFileClass {

	public static void main(String[] args) {
		File myFile = new File("src/files/colors.txt");
		
		System.out.println(myFile.getName());
		System.out.println(myFile.getAbsolutePath());
		System.out.println(myFile.length());
		System.out.println(myFile.exists());
		System.out.println(myFile.isDirectory());
		System.out.println(myFile.isFile());
	
		System.out.println("FILES IN SRC FOLDER: ");
		
		File projectFolder = new File("src");
		
		File[] files = projectFolder.listFiles();
		
		for (int i = 0 ; i < files.length ; i++) {
			File currentFile = files[i];
			
			System.out.println( currentFile.getName() + "/");
			
			if (currentFile.isDirectory()) {
				File[] files2 = currentFile.listFiles();
			
				for (int j = 0 ; j < files2.length ; j++) {
					System.out.println("\t" + files2[j].getName());
				}	
			}	
		}
	}

}
