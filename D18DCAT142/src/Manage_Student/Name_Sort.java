package Manage_Student;

import java.util.Comparator;

public class Name_Sort implements Comparator<Student>{
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getFullName().compareToIgnoreCase(s2.getFullName());
	}
}
