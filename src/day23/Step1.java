package day23;

import java.util.ArrayList;
import java.util.Arrays;

public class Step1 {
    public static void main(String[] args) {
        // 1. 배열
            // 객체{객체 , 객체 , 객체}
        String[] strArrays = new String[3];
        strArrays[0] = "유재석";
        // strArrays[1] = 100;
        strArrays[1] = "강호동";
        strArrays[2] = "신동엽";
        // strArrays[3] = "서장훈";

        System.out.println("배열상태 : " + Arrays.toString(strArrays));
        System.out.println("배열호출 : " + strArrays[1]);
        System.out.println("===========================================");
            // Object클래스 toString() 객체의 주소값을 반환
            // Arrays.toString(배열타입변수) : 해당 배열상태 호출

        // 2. 클래스타입 : 컬렉션프레임워크(수집관련 라이브러리 제공)
            // 객체{객체 , 객체 , 객체}
            // ArrayList : 가변길이 가능하도록 만든 객체
        ArrayList<String> strList = new ArrayList<>();
            // 클래스명<제네릭타입> 변수명 = new 클래스명<>();
        strList.add("유재석");
        // strList.add(100);
        strList.add("강호동");
        strList.add("신동엽");
        strList.add("서장훈");

        System.out.println("리스트상태 : " + strList);
        System.out.println("리스트호출 : " + strList.get(1));
        System.out.println("리스트길이 : " + strList.size());
        strList.remove(1);   // 해당 인덱스 삭제
        System.out.println("1번 인덱스 삭제 후 리스트상태 : " + strList);
        System.out.println("===========================================");

        // 3. 가변길이배열객체 만들기
        SimpleList<String> simpleList = new SimpleList<>();
        simpleList.add("유재석");
        simpleList.add("강호동");
        simpleList.add("신동엽");
        simpleList.add("서장훈");
        // simpleList.add(100);

        System.out.println("리스트 상태 : " + simpleList);
        System.out.println("리스트 요소 호출 : " + simpleList.get(1));
        System.out.println("리스트 길이 : " + simpleList.size());
        simpleList.remove(1);   // 해당 인덱스 삭제
        System.out.println("1번 인덱스 삭제 후 리스트상태 : " + simpleList);

        SimpleList<Integer> intList = new SimpleList<>();
        intList.add(100);
        intList.add(200);
        intList.add(300);
        intList.add(400);

        // JS
            // JS배열 : [값1 , 값2 , 값3] => List
            // JS객체 : {필드 : 값 , 필드 : 값 , 필드 : 값} => Map
    }
}
