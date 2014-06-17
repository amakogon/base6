package astelit.day1;

import astelit.day2.Address;

public class Student {

	private String name;
	private int age;
	private Student friend;
	private Address address;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setAge(int vozrast) {
		if (vozrast > 0) {
			age = vozrast;
		} else {
			System.out.println("wrong value");
		}
	}

	public void meetFriend(Student friend) {
		this.friend = friend;
	}

	public void tellAboutFriend() {
		if (friend != null) {
			System.out.println("My friend: ");
			friend.sayHello();
		} else {
			System.out.println("I dont have fried");
		}
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hi, my name is " + name + ", age = " + age + " ");
		if (address != null) {
			address.showAddress();
		}
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
