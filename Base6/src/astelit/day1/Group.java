package astelit.day1;

public class Group {
	private String groupName;
	private Student[] students;
	private int index = 0;

	public Group() {
		students = new Student[5];
	}

	public Group(String groupName, int groupSize) {
		this.groupName = groupName;
		students = new Student[groupSize];
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public void addStudent(Student student) {
		if (index < students.length) {
			students[index] = student;
			index++;
		} else {
			System.out.println("Sorry");
		}
	}

	public void removeLastStudent() {
		if (index > 0) {
			students[--index] = null;
		} else {
			System.out.println("group is empty");
		}
	}

	public void showStudents() {
		for (int i = 0; i < index; i++) {
			students[i].sayHello();
		}
	}

}
