package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		// step 1: create FileInputStream object
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");

		// step 2: create respective file type object
		Properties prop = new Properties();
		
		prop.load(fis);
		String url = prop.getProperty("url");
		System.out.println(url);
	}

}
