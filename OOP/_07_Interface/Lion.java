package OOP._07_Interface;

import OOP._02_Class.Animal;

public class Lion extends Animal implements Predator{
    
    public String getFood(){
        return "bananan";
    }
}
