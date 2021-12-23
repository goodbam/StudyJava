package OOP._06_Constructor;

import OOP._05_Inheritance.Dog;

public class HouseDog extends Dog {

    /*
    생성자(Constructor)의 규칙
    1.클래스명과 메서드명이 동일하다.
    2.리턴타입을 정의하지 않는다.(void 포함)

    생성자의 장점
    1.객체가 생성될 때 객체변수에 값을 설정해야만 생성될 수 있도록 강제한다.
    2.필수 입력 값을 토대로 로직을 구성할 수 있다.
    */
    public HouseDog (String name){
        this.setName(name);
    }

    // 생성자 오버로딩(Overloading) 활용하여 여러개의 생성자를 만들 수 있다.
    public HouseDog (int type){
        if (type == 1){
            this.setName("시바견");
        }else if (type == 2){
            this.setName("진돗개");
        }
    }

    public static void main(String[] args) {
        HouseDog dog  = new HouseDog("happy"); // 객체 생성시에 입력 값을 넣어야 생성할 수 있디.
        HouseDog dog1 = new HouseDog(1);
        HouseDog dog2 = new HouseDog(2);

        System.out.println(dog.name);
        System.out.println(dog1.name);
        System.out.println(dog2.name);
    }
}
