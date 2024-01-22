package day15;

import day13.Step4.pakage1.B;

public class Driver {
    // 메소드(객체의 행위) 매개변수로 운전할 매개체(버스/택시)
        // 버스와 택시를 모두 매개변수로 받고 싶을때 상위클래스
    public void drive(Vehicle vehicle){
        vehicle.run();
        // - 자식타입으로 다시 변환(강제타입 = 캐스팅)
        // !!! : instanceof 연산자
        // 객체명 instanceof 타입
        System.out.println(vehicle instanceof Bus ? "<버스타입>" : "<택시타입>");
        System.out.println(vehicle instanceof Taxi ? "<택시타입>" : "<버스타입>");
        System.out.println(vehicle instanceof Object);

        Bus bus2 = new Bus();   // 자식객체는 생성시 부모객체를 먼저 생성한다
        System.out.println(bus2 instanceof Vehicle);
        // Object : 자바의 모든 클래스의 최상위 부모
        System.out.println(vehicle instanceof Object);
    }
}
