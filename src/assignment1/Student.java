package assignment1;

import java.util.ArrayList;
import java.util.Comparator;

public class Student {
		String firstName;
		String lastName;
		double gpa;

		
		public Student() {
			this.firstName = "";
			this.lastName = "";
			this.gpa = 0;
		}
		
		public Student(String fName ,String lName ,double g) {
			this.firstName = fName;
			this.lastName = lName;
			this.gpa = g;
		}
		
		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public double getGpa() {
			return gpa;
		}

		public void setGpa(double gpa) {
			this.gpa = gpa;
		}
		
		public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

			public int compare(Student s1, Student s2) {
			   String lastName1 = s1.getLastName().toUpperCase();
			   String lastName2 = s2.getLastName().toUpperCase();

			   //ascending order
			   return lastName1.compareTo(lastName2);

			   //descending order
			   //return StudentName2.compareTo(StudentName1);
		    }
		};

}


