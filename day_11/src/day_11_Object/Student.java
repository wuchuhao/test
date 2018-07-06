package day_11_Object;

public class Student {

	private int age11;

	private int age12;

	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int age, String name) {
		super();

		this.age11 = age;

		this.age12 = age;

		this.name = name;
	}

	public int getAge() {

		return age11;
	}

	public void setAge(int age) {
		this.age11 = age;

		return age12;
	}

	public void setAge(int age) {
		this.age12 = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
