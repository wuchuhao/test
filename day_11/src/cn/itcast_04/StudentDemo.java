package cn.itcast_04;

public class StudentDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s=new Student();
		s.setName("lin");
		s.setAge(27);
		Object obj=s.clone();
		Student s2=(Student)obj;
		s.setName("lin");
		s.setAge(26);
		System.out.println(s.getAge()+s.getName());
		System.out.println(s2.getAge()+s2.getName());
	}
}
