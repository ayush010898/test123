package com.telstra;
import java.io.FileInputStream;
import java.io.IOException;

public class CheckFileNotFoundException {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = null; 
		/*constructs FielInputStream (File Filename)
		*throws FileNotFoundException which is a checked exception
		**/
		
		fis = new FileInputStream("C:\\Training\\java\\basic\\workspace\\basic\\src\\com\\abc.txt");
		int k;
		/*method read() of FileInputStream class also throws 
		 * *a checked exception: IOException
		 */
		
		
		while((k = fis.read()) != -1) {
			System.out.println((char)k);
		}
		
		fis.close();
	}

}
