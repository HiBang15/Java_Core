package Colection_Book;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;
import java.awt.List;
import java.io.*;

public class TestBook {
	public static void main(String[] args) throws IOException {
		ArrayList<String> linesList = new ArrayList();
		String fileName = "./test.txt";
		Path p = Paths.get(fileName);
		Charset charset = Charset.forName("US-ASCII");
//		TreeSet t = new TreeSet();
		try( BufferedReader reader = Files.newBufferedReader(p,charset)){
			String line = null;
			while((line = reader.readLine()) != null){
//				System.out.println(line);
//				linesList.add(line);
				String[] s = line.split(" ");
//				t.add(s);
//				linesList.add(s);
//				for(int i=0; i<)
//				System.out.println(t);
//				for(TreeSet w : t) {
//					if(t.length() > 3) {
//						
//					}
					
//				}
				
			}
		}catch(IOException x) {
			System.err.format("IOException : %s%n", x);
		}
		
		
	}
}
