package astelit.day2;

import astelit.day1.Student;

public class TestConstructor {
	public static void main(String[] args) {

		Address address = new Address("Ukraine", "Kiev", "Amosova", 12);
//		address.showAddress();

		
		
		Student student1 = new Student("Lena", 18);
		Student student2 = new Student("Ksiusha", 18);
		student1.setAddress(address);
		student1.sayHello();
		student2.setAddress(address);
		student2.sayHello();

	}
}
