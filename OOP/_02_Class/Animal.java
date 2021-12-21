package OOP._02_Class;

public class Animal {
    String name; // 객체 변수이고 객체 변수는 공유되지 않는다

    public void setName(String name){
        this.name = name; // this는 클래스에 의해 생성된 객체를 지칭한다.
    }

    public static void main(String[] args) {
        Animal cat = new Animal(); // "Animal" 자료형인 "cat" 객체 생성
        cat.setName("body"); // 메서드 호출

        Animal dog = new Animal();
        dog.setName("happy");

        Animal lion = new Animal();
        lion.name = "popo";

        System.out.println(lion.name);
        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}
