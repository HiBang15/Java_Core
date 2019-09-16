package Colection;

import java.time.LocalDate;
import java.util.*;

public class Example {
	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList();
		
		list.add(new Employee(22l, "Lokesh",LocalDate.now()));
		list.add(new Employee(45l, "Hung",LocalDate.now()));
		list.add(new Employee(75l, "Duy",LocalDate.now()));
		list.add(new Employee(88l, "MAnh",LocalDate.now()));
		list.add(new Employee(99l, "Tan",LocalDate.now()));
		list.add(new Employee(65l, "khanh",LocalDate.now()));
		
		Collections.sort(list, new NameSorter());
//		Collections.sort(list, new AgeSorter());
		System.out.println(list);
	}
}
