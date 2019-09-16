package Manage_Student;
import java.util.*;
public class main_ {
	public static void main(String[] args) {
		Student_Function st = new Student_Function();
		Scanner in =  new Scanner(System.in);
		System.out.println("+-------------------MENU---------------------+");
		System.out.println("1. Nhap thong tin sinh vien");
		System.out.println("2. Hien thi danh sach sinh vien");
		System.out.println("3. Sap xep danh sach theo ten sinh vien");
		System.out.println("4. Tim kiem danh sach sinh vien theo lop");
		System.out.println("+--------------------------------------------+");
		System.out.println("Nhap lua chon cua ban: ");
		int choose = in.nextInt();
		while(choose != 5) {
			switch(choose) {
			case 1: st.addStudent(); break; 
			case 2: st.showStudent();break; 
//			case 3: st.Sort_Name();break; 
//			case 4: st.Class_Student();break; 
//			default : System.out.println("Nhap lai lua chon cua ban!");
		}
		}
	}
}
