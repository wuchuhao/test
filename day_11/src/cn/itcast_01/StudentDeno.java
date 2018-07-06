package cn.itcast_01;

public class StudentDeno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setAge(30);
		s.setName("fengqingyang");
		System.out.println(s.getName()+"------"+s.getAge());
		s.show();
		Student s2=new Student(29,"fqy");
		System.out.println(s2.getName()+"------"+s2.getAge());
		s2.show();
				

	}

}
