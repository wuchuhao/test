package cn.itcast_01;

import com.wu_01.Animal;
import com.wu_01.Cat;
import com.wu_01.Dog;

public class AnimalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Cat();
		a.eat();
		a.sleep();
        System.out.println("---------------");
        a=new Dog();
        a.eat();
        a.sleep();
        System.out.println("---------------");
        Dog d=(Dog)a;
        d.eat();
        d.sleep();
        d.jump();
   
        
        
	}

}
