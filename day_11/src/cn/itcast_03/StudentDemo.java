package cn.itcast_03;

public class StudentDemo {
	public static void main(String[] args) {
		Student s1 = new Student("lin",21);
		Student s2 = new Student("lin",218);
		System.out.println(s1.equals(s2));
		Student s3= s1;
		System.out.println(s1.equals(s1));
		System.out.println(s1.equals(s3));
		Student s4=new Student("lin",21);
		System.out.println(s1.equals(s4));
		Demo d=new Demo();
		System.out.println(s1.equals(d));
	}
}
class Demo{

}