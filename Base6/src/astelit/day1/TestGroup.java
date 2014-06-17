package astelit.day1;

public class TestGroup {

	public static void main(String[] args) {
		Group group1 = new Group("Astelit", 2);
		Group group2 = new Group();
		Student student1 = new Student("Lena", 18);
		Student student2 = new Student("Ksiusha", 18);
		Student student3 = new Student("Petro", 20);
		
		group1.addStudent(student1);
		group1.addStudent(student2);
		group1.addStudent(student3);
		
		group1.showStudents();
		
		

	}

}
