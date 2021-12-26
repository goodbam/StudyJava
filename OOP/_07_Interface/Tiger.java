package OOP._07_Interface;

import OOP._02_Class.Animal;

public class Tiger extends Animal implements Predator{
    
    public String getFood(){
        return "apple";
    }
}
