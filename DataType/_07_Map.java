package DataType;

import java.util.HashMap;

public class _07_Map {

    public static void main(String[] args) {
        /*
        1.HashMap
        ->순서의 의존하지 않고 데이터를 저장한다.
        2.LinkedHashMap 
        ->입력된 순서대로 데이터를 저장한다.
        3.TreeMap
        ->입력된 Key의 오름차순 순서로 데이터를 저장한다.
        */
        HashMap<String,String> hasgMap = new HashMap<>();
        
        // put()
        // Key와 value 추가
        hasgMap.put("people", "사람");
        hasgMap.put("baseball", "야구");
        System.out.println("put(\"KEY\",\"VALUSE\") : "+hasgMap);

        // get()
        // key에 해당하는 value 값을 얻기
        System.out.println("get(\"people\") : "+hasgMap.get("people"));

        // containsKey()
        // Key가 있는지 없는지 확인하고 그 결과 값을 리턴한다.
        System.out.println("containsKey(\"people\") : "+hasgMap.containsKey("people")); // true 출력

        // size()
        // Map이 가지고 있는 아이템 갯수를 출력한다.
        System.out.println("size() : "+hasgMap.size()); // 2 출력

        // keySet()
        // 모든 key를 모아서 리턴한다.
        System.out.println("keySet() : "+hasgMap.keySet()); // 2 출력

        // remove()
        // key에 해당하는 아이템(key,value)을 삭제하고 그 value 값을 리턴한다.
        System.out.println("remove(\"people\") : "+hasgMap.remove("people"));// "사람" 출력

    }
}