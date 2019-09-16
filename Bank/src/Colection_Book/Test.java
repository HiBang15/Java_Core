package Colection_Book;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.*;

public class Test {
	public static void main(String[] args) throws IOException {
		String fileName = "./test.txt";
		Path p = Paths.get(fileName);
		Charset  charset = Charset.forName("US-ASCII");
		
		try(BufferedReader reader = Files.newBufferedReader(p)) {
			String line = null;
			while((line = reader.readLine()) != null) {
//				String regex = "^[ ,]+$";
				String[] s = line.split(" ");
				for(String str : s) {
					System.out.println(str);
				}
			}
			
		}catch(IOException ex) {
			System.err.format("IOException : %s%n", ex);
		}
	}
}
