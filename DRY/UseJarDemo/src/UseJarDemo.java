import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class UseJarDemo {
	public static void main(String[] args) {
		/**
		 * use HelloUtil
		 */
		System.out.println("Hello J Archive r");
		Hello2.SayHello("haha");
		
		/**
		 * use common-io
		 */
		 String fileName = "1.txt";
		  File file = new File(fileName);
		  String fileContent = "";
		  try {
		   fileContent = FileUtils.readFileToString(file, "GBK");
		   System.out.println(fileContent);
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		  fileContent +="Helloworld";
		  try {
		   FileUtils.writeStringToFile(file, fileContent, "GBK");
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
	}
}
