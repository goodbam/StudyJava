package OOP._05_Inheritance;

public class HouseDog extends Dog {

    /*
    아래 "Sleep()" 메소드 처럼 부모클래스의 메소드를
    자식 클래스가 같은 형태로 또 다시
    구현하는 행위를 메소드 오버라이딩(Method Overriding)이라고 한다.
    *메소드 덮어 쓰기*
    */
    public void sleep(){
        System.out.println(this.name + " zzz in house");
    }
    
    /*
    입력 항목이 다른 경우 동일한 이름의 메소드를 만들 수 있는데 이런 경우를
    메소드 오버로딩()이라고 한다.
    *메소드 추가*
    */
    public void sleep(int hour){
        System.out.println(this.name + " zzz in house for " + hour + " hours");
    }
    
    public static void main(String[] args) {
        HouseDog houseDog = new HouseDog();
        houseDog.setName("happy");
        houseDog.sleep();
        houseDog.sleep(3);
    }
}
