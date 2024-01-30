package day21;

import day13.Step4.pakage2.C;

public class Step3 {
    public static void main(String[] args) {
        Car car = new Car();

        // * 매개변수에 익명 자식 객체 대입
        car.run3(new Tire(){
            @Override
            public void roll(){
                System.out.println("기아타이어가 굴러 갑니다.");
            }
        });
    }
}
