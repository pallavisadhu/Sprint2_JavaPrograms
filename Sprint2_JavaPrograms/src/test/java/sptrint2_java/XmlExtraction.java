package sptrint2_java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.Test;



public class XmlExtraction {
	
	
	@Test
	public void testCase1() throws IOException  {
		File f = new File("/Users/pallavisadhu/Desktop/Sprint2_JavaPrograms/Sprint2_JavaPrograms/src/test/java/wiki.rtf");
		BufferedReader reader;
		String str = "";

		try {
			reader = new BufferedReader(new FileReader(f));
			String line = reader.readLine();

			while (line != null) {
				if(line.contains("page"))
					str = str + line;
				// read next line
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		System.out.println(str);

	}

}
