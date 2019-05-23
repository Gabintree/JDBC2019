package java20190416;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

public class Java20190416_0 {

	public static void main(String[] args) {
	Path file = Paths.get("C:\\javastudy\\Simple.txt");
	BufferedWriter writer = null;
	
	try {
		writer = Files.newBufferedWriter(file);
		writer.write('A');
		writer.write('z');
		
		if(writer != null)
			writer.close();
		
		
	}
		catch(IOException e) {
		e.printStackTrace();
	}
	
	System.out.println("ddddd"); //  try catch 로 예외처리 해주면 dddd가 출력됨
											// try chtch를 주석처리하면 죽어서 출력안됨
}

}


