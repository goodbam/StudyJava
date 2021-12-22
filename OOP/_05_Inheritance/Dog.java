package OOP._05_Inheritance;

import OOP._02_Class.Animal;

public class Dog extends Animal{

    public void sleep(){ // sleep 기능을 추가하여 Animal Class의 기능을 확장하였다.
        System.out.println(this.name + " zzz");
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }

}
