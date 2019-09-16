package Manage_Student;

import java.util.*;

public class Student implements Interfacee_Student {
	private String ID; 
	private String fullName; 
	private String major; 
	private String Team;
	
	Scanner input =  new Scanner(System.in);
	Student(){
		super();
	}
	Student(String id, String fullName, String major, String Team){
		this.ID = id; 
		this.fullName = fullName; 
		this.major = major; 
		this.Team = Team;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getTeam() {
		return Team;
	}
	public void setTeam(String team) {
		Team = team;
	}
	
	@Override
	public void input() {
		System.out.println("Nhap thong tin sinh vien");
		System.out.println("ID Student: ");
		ID = input.nextLine();
		System.out.println("Full Name: ");
		fullName = input.nextLine();
		System.out.println("Major: ");
		major = input.nextLine();
		System.out.println("Class: ");
		Team = input.nextLine();
	}
	@Override
	public void display() {
		System.out.println("ID: "+ID +"\t| Full Name:" +fullName+"\t |Major" + major + "\t\t|Class" + Team );
	}
}
