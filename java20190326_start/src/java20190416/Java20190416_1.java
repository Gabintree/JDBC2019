package java20190416;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java20190416_1 {

	public static void main(String[] args) {
		try {
			md1();
		}
		catch(IOException e) {
			e.printStackTrace();
		}	

	}
	public static void md1() throws IOException {
		md2();
	}
	public static void md2() throws IOException {
		Path file = Paths.get("C:\\javastudy\\Simple.txt");
		BufferedWriter writer = null;
		

		writer = Files.newBufferedWriter(file);
		writer.write('A');
		writer.write('z');
		
		if(writer != null)
			writer.close();
			
	}

}
