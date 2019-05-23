package java20190416;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Java20190416_3 {
	public static void main(String[] args)  {

	Path file = Paths.get("C:\\javastudy\\Simple.txt");
	   BufferedWriter writer = null;   
	   try {
	      writer = Files.newBufferedWriter(file);   // IOException �߻� ����
	      writer.write('A');   // IOException �߻� ����
	   }
	   catch(IOException e) {
	      e.printStackTrace();
	  }
   
 finally {
	 System.out.println(" ���� ����!!!!! ");
	 try {
		 if(writer != null)
			 writer.close();
	 }
	 catch(IOException e) {
		 e.printStackTrace();
	 }
 }

	}

}
