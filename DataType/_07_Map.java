package DataType;

import java.util.HashMap;

public class _07_Map {

    public static void main(String[] args) {
        HashMap<String,String> hasgMap = new HashMap<>();
        
        // put()
        // Key와 value 추가
        hasgMap.put("people", "사람");
        hasgMap.put("baseball", "야구");
        System.out.println(hasgMap);

        // get()
        // key에 해당하는 value 값을 얻기
        System.out.println("get(\"people\") : "+hasgMap.get("people"));

    }
}