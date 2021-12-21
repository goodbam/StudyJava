package OOP._05_Inheritance;

import OOP._02_Class.Animal;

public class Dog extends Animal{
    
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
    }

}
