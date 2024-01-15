package day10;

public class Step2 {
    public static void main(String[] args) {
        // 234P : 가변길이 매개변수
            // 메소드를 호출할때에는 매개변수의 개수에 맞게
            // 가변길이 매개변수를 가지고 있다면 개수와 상관
        
        // - 다른 클래스에 있는 메소드를 사용하고 싶을때
            // 1. 객체생성 : 메소드 호출하려고
        Computer myCom = new Computer();
            // 2. 메소드 호출
        int result0 = myCom.sum2(1,2);
        System.out.println("result0 = " + result0);
            // vs
        int result1 = myCom.sum(1,2,3);
        System.out.println("result1 = " + result1);

        int result2 = myCom.sum(1,2,3,4,5);
        System.out.println("result2 = " + result2);
        
        int[] values = {1,2,3,4,5};
        int result3 = myCom.sum(values);
        System.out.println("result3 = " + result3);
        
        int result4 = myCom.sum(new int[]{1,2,3,4,5});
        System.out.println("result4 = " + result4);
        
        // vs
        
        int result5 = myCom.sum3(values);
        System.out.println("result5 = " + result5);

        // int result6 = myCom.sum3(1,2,3);
    }
}
/*
    객체지향 프로그래밍 : 객체들 간의 상호작용
     
*/