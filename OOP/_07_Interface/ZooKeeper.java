package OOP._07_Interface;

public class ZooKeeper{

    /*
    인터페이스 적용 전
    1.ZooKeeper Class는 동물 종류에 의존하고 있다.
    2.동물이 추가된다면 ZooKeeper Class에 추가되어야 한다.
    */
    public void feed(Tiger tiger){
        System.out.println("feed apple");
    }

    public void feed(Lion lion){
        System.out.println("feed banana");
    }
    
    /*
    인터페이스 적용 후
    1.ZooKeeper Class는 동물 종류에 상관없는 독립적인 클래스가 되었다.
    2.동물이 추가되더라도 Zookeeper Class는 상관 없다. Predator Interface만 바라보면 되니깐.
    */
    public void feed(Predator predator) {
        System.out.println("feed "+predator.getFood());
    }

    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        zooKeeper.feed(tiger);
        zooKeeper.feed(lion);
    }
}
