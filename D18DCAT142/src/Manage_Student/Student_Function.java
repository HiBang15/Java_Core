package Manage_Student;

import java.util.*;

public class Student_Function extends Student {
	ArrayList<Student> listStudent = new ArrayList();
	
	public void addStudent() {
		Student st = new Student();
		Scanner src = new Scanner(System.in);
		System.out.println("Nhap so luong sinh vien: ");
		int x = src.nextInt();
		for(int i= 0; i<x; i++) {
			super.input();
			Student std = new Student(st.getID(), st.getFullName(), st.getMajor(), st.getTeam());
			listStudent.add(std);
		}
	}
	public void showStudent() {
		for(Student st: listStudent) {
			st.display();
		}
	}
	
	public void Sort_Name() {
		System.out.println("Danh sach sap xep theo ten");
		Collections.sort(listStudent, new Name_Sort());
	}
	public void Class_Student() {
		Scanner src = new Scanner(System.in);
		System.out.println("Cac lop");
		int i=1;
		for(Student s : listStudent) {
			System.out.print((i+1)+". "+s.getTeam());
			i++;
		}
		String team ;
		System.out.println("Nhap lop sinh vien: ");
		team = src.nextLine();
		for(Student st : listStudent) {
			if(team.equalsIgnoreCase(st.getTeam())) {
				super.display();
			}
		}
	}
}
