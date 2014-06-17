package astelit.day1;

public class TestFriend {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Artem");
		s1.setAge(22);
		s1.tellAboutFriend();
		
		Student s2 = new Student();
		s2.setName("Oleg");
		s2.setAge(26);	
		s1.meetFriend(s2);
		
		s1.tellAboutFriend();
		
	}
}
