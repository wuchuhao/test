package cn.itcast_01;

public class Student {
int age;
String name;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int age, String name) {
	super();
	this.age = age;
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void show(){
System.out.println("����:"+name+",����:"+age);




	}

}
