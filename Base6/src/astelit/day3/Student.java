package astelit.day3;

public class Student extends Human {

	int stepuha;

	public Student(int age, String name) {
		super(age, name);
	}

	public void study() {
		System.out.println("I am studying");
	}

	public void sayHello() {
		System.out.println("I am worker");
		super.sayHello();
	}

}
