package DataType;

public class _05_StringBuffer{

    public static void main(String[] args) {

        /*
        String 자료형
        1."+" 연산이 있을 때 마다 새로운 String 객체가 생성된다. 아래 예시 같은 경우 총 4개의 객체가 생성 되었다.
        2.한번 값이 생성되면 그 값을 변경할 수 없다.(immutable)
        3.상대적으로 StringBuffer 자료형보다 메모리 사용량도 적고 속도도 빠르다.
            ->문자열 변경 작업이 거의 없는 경우에 사용한다.
        */
        String result= ""; // 객체 생성
        result += "Hello"; // 객체 생성
        result += " ";     // 객체 생성
        result += "java";  // 객체 생성
        System.out.println("String : " + result); // Hello java 출력

        /*
        StringBuffer 자료형
        1.객체가 한 번만 생성된다.
        2.생성된 값을 자유롭게 변경할 수 있다.(mutable)
        3.상대적으로 String 자료형보다 메모리 사용량도 많고 속도도 느리다.
            ->문자열 추가나 변경등의 작업이 많을 경우에만 사용한다.
        */
        StringBuffer sb = new StringBuffer(); // 객체 생성
        sb.append("Hello");
        sb.append(" ");
        sb.append("java"); 
        System.out.println("StringBuffer : " + sb); // Hello java 출력

        //문자열 길이 구하기
        int sbLen = sb.length();
        System.out.println("length() : " + sbLen);

        //문자열 자르고 반환
        System.out.println("substring() : " + sb.substring(0, 5));

        //해당 문자가 시작되는 Index를 반환
        System.out.println("indexOf() : " + sb.indexOf("java"));

        //문자열 치환
        System.out.println("replaceAll() : " + sb.toString().replaceAll("Hello", "Bye"));

        //문자열 대문자로 변경
        System.out.println("toUpperCase() : " + sb.toString().toUpperCase());
        
        //문자열 삽입
        sb.insert(0, "Insert Test ");
        System.out.println("insert() : " + sb);
    }
}