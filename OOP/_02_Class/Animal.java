package OOP._02_Class;

public class Animal {
    String name; // 객체 변수이고 객체 변수는 공유되지 않는다

    public static void main(String[] args) {
        Animal cat = new Animal();

        System.out.println(cat.name);
    }
}
