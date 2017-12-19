package guiSisi;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextFileWriter {

	private Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		

	}
	
	public TextFileWriter(String input) {

		
		
	}
	
	public void createFile() {
		
		String s = in.nextLine();
		
		Path file = Paths.get("savefile.txt");
		Files.write(file, s, Charset.forName("UTF-8"));
		
	}

}
