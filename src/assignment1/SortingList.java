package assignment1;

import java.util.*;

public class SortingList {

	public static void main(String[] args) {
		
		ArrayList<Student> student_list = new ArrayList<Student>();
		student_list.add(new Student("Ankit", "Rijal", 4));
		student_list.add(new Student("Ankura", "Sitaula", 3.8));
		student_list.add(new Student("Lava", "Pokharel", 3.2));
		student_list.add(new Student("Anish", "Rijal", 3));
		student_list.add(new Student("Aavash", "Kharel", 3.7));
		student_list.add(new Student("Bibek", "Sapkota", 3.4));
		
		
		System.out.println("Sorting Student based on their last name");
		   Collections.sort(student_list, Student.StuNameComparator);

		   for(Student str: student_list){
				System.out.println(str.getFirstName() + " " + str.getLastName() + " GPA = " + str.getGpa());
		   }
	}

}
