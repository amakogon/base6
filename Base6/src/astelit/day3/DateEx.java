package astelit.day3;

import java.util.Date;

import astelit.day1.Student;

public class DateEx {

	public static void main(String[] args) {
		Date date = new Date();	
		Date date1 = new Date();
		System.out.println(date.getTime());
		
		Student s1 = new Student("Artem", 21);
		Student s2 = new Student("Artem", 21);
		
		if(s1.equals(s2)) {
			System.out.println("sadsadsa");
		}
		
		
		
	}

}
