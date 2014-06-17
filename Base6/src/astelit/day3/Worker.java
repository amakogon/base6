package astelit.day3;

public class Worker extends Human {

	int salary;

	public Worker(int age, String name) {
		super(age, name);
	}

	public void work() {
		System.out.println("I am working");
	}
	
	public void sayHello() {
		System.out.println("I am student");
		super.sayHello();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	

}
