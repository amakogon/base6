package astelit.day3;

public class TestInheritance {
	
	public static void main(String[] args) {
		Human human = new Human(85, "Anton");
		Human student = new Student(25, "Gora");
		Human worker = new Worker(16, "Vania");
		
		worker.sayHello();
		student.sayHello();
		human.sayHello();
		
	}

}
