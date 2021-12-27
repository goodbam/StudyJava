package DataType;

import java.util.ArrayList;
import java.util.Comparator;

public class _06_ArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
        
        // add()
        // 인덱스 및 요소 추가
        list.add("129");
        list.add(1,"142");
        list.add(2,"138");
        System.out.println("list : " + list);
        
        // get()
        // 인덱스 값 추출
        System.out.println("get(1) : " + list.get(1));

        // size()
        // 리스트 길이 반환
        System.out.println("size() : " + list.size());

        // contains()
        // 리스트 안에 해당 항목이 있는지 검사하고 그 결과를 True, False로 반환
        System.out.println("contains(142) : " + list.contains("142")); // True
        System.out.println("contains(900) : " + list.contains("900")); // False

        // remove()
        // 1.remove(객체) 해당 객체를 삭제하고 그 결과를 True, False로 리턴한다.
        System.out.println("remove(\"142\") : " + list.remove("142")); // True
        System.out.println("remove(\"900\") : " + list.remove("900")); // False
        // 2.remove(인덱스) 해당 인데스의 값을 삭제하고 삭제된 값을 반환한다.
        System.out.println("remove(1) : " + list.remove(1));

        // String.join()
        // 값의 구분자를 넣어 문자열로 반환한다.
        list.add("142");
        list.add("138");
        String result = String.join("-",list);
        System.out.println("String.join(\"-\",\"list\") : " + result);

        // sort()
        // sort 메서드는 정렬기준을 파라미터로 전달해야한다.
        list.sort(Comparator.naturalOrder()); // 오름차순(순반향)
        System.out.println("sort(Comparator.naturalOrder()) : " + list); 
        list.sort(Comparator.reverseOrder()); // 내림차순(역반향)
        System.out.println("sort(Comparator.reverseOrder()) : " + list); 

    }
}