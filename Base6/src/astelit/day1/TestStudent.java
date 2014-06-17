package astelit.day1;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(-12);
		student.setAge(21);
//		student.
		student.setName("Artem");
		System.out.println(student.getAge());
		
		student.sayHello();
		

	}
}
