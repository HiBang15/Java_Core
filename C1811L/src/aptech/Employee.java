package aptech;

import java.util.*;

public class Employee  extends Person{

	private int salary;
	
	Employee(String name, int age, int salary){
		super(name, age);
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
