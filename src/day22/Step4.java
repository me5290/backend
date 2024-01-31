package day22;

import day13.Step4.pakage2.C;

public class Step4 {
    // 제네릭 메소드
    // <타입파라미터> 리턴타입 메소드명(매개변수){}

    // 1. 일반메소드
    public static boolean boxing1(String s){
        return false;
    }

    // 2. 제네릭메소드
    public static <T> Box3<T> boxing4(T t){
        Box3<T> box = new Box3<>();
        box.setT(t);
        return box;
    }

    // 582P 제네릭 메소드 : 제한된 파라미터
    public static <T extends Number> boolean compare(T t1, T t2){
        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();
        return v1 == v2;
    }

    public static void main(String[] args) {
        Box3<Integer> box1 = boxing4(100);
        int intValue = box1.getT();

        Box3<String> box2 = boxing4("홍길동");
        String strValue = box2.getT();

        Box3<Car> box3 = boxing4(new Car());
        Car carValue = box3.getT();

        // 582P
        boolean result1 = compare(10 , 20);
        System.out.println(result1);
        boolean result2 = compare(4.5 , 4.5);
        System.out.println(result2);
        //boolean result3 = compare("안녕하세요" , new Car());
        //System.out.println(result3);
        //boolean result4 = compare(new Object() , new Object());
        //System.out.println(result4);
    }
}
