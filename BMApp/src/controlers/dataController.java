package controlers;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import model.BookReaderManagement;
import model.Book;
import model.Reader;


public class dataController {
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private Scanner scanner;
	private PrintWriter printWriter;
	
	public void openConnectionToRead(String fileName) {
		try {
			File mFile = new File(fileName);
			if(!mFile.exists()) {
				mFile.createNewFile();
			}
			scanner = new Scanner(mFile,"UTF-8");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void closeConnectionToRead(String fileName) {
		scanner.close();
	}
	public void closeConnectionToWrite(String fileName) {
		printWriter.close();
		try {
			bufferedWriter.close();
			fileWriter.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void openConnectionToWrite(String fileName) {
		try {
			fileWriter = new FileWriter(fileName,true);
			bufferedWriter = new BufferedWriter(fileWriter);
			printWriter = new PrintWriter(bufferedWriter);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void writeBookToFile(Book book,String fileName) {
		openConnectionToWrite(fileName);
		printWriter.println(book.getBookID() + "|" + book.getBookName() + "|"
                + book.getSpecialization() + "|" + book.getAuthor() + "|"
                + book.getPublishYear() + "|" + book.getQuatity());
        closeConnectionToWrite(fileName);
	}
	public Book[] readAllBookFromFile(String fileName) {
		openConnectionToRead(fileName);
		Book[] books = new Book[countLines(fileName)];
	}
	
}
