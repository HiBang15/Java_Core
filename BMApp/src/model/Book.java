package model;

public class Book {
	private static int id=100000;
	private int bookID;
	private String bookName;
	private String author;
	private String specialization;
	private int publishYear;
	private int quatity;
	
	public void Book(int bookID) {
		this.bookID = bookID;
	}
	public void Book(int bookID, String bookName, String author,
			String specialization, int publichYear, int quantity, int publishYear) {
		this.bookID = bookID;
		this.bookName = bookName;
		this.author = author;
		this.specialization = specialization;
		this.publishYear = publishYear;
		this.quatity = quantity;
	}
	public static int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBookID() {
		return bookID;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getPublishYear() {
		return publishYear;
	}
	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	} 
}
