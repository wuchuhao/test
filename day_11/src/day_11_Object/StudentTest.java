package day_11_Object;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.hashCode());
		Class c = s1.getClass();
		System.out.println(c.getName());
		String str2 = s1.getClass().getName();
		System.out.println(str2);

	@Override
	public String toString() {
		return "StudentTest [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
