package model;

public class Reader {
	private static int id = 10000000;
	private int readerID;
	private String fullname;
	private String address;
	private String phoneNumber;
	
	public Reader() {
		
	}
	public Reader(int readerID) {
		this.readerID = readerID;
	}
	public Reader(int readerID, String fullname, String address, String phoneNumber) {
		this.readerID = readerID; 
		this.fullname = fullname;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Reader.id = id;
	}
	public int getReaderID() {
		return readerID;
	}
	public void setReaderID(int readerID) {
		this.readerID = readerID;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
