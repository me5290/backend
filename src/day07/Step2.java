package day07;
// 클래스 용도 : 2. 실행 클래스
public class Step2 {
    public static void main(String[] args) {
        // 215P
        // 1. 객체 생성
            // 1. new
        //new
            // 2. 생성자/클래스명
        //new 생성자/클래스명()
            // 3. 변수 선언
        //Car car

        Car myCar = new Car();

        System.out.println("모델명 : " + myCar.model);
        System.out.println("시동여부 : " + myCar.start);
        System.out.println("현재속도 : " + myCar.speed);

        Car yourCar = new Car();

        System.out.println("모델명 : " + yourCar.model);
        System.out.println("시동여부 : " + yourCar.start);
        System.out.println("현재속도 : " + yourCar.speed);

        // 217P
        // 필드는 객체의 데이터 이므로 객체가 존재하지 않으면 필드도 존재하지 않는다
        // 1. 객체 생성
        Car2 myCar2 = new Car2();   // 102 번지(103번지[503번지] 104번지 105번지)
        // 2. 객체 내 필드 호출
        System.out.println("제작회사 : " + myCar2.company);
        System.out.println("모델명 : " + myCar2.model);
        System.out.println("색깔 : " + myCar2.color);
        System.out.println("최고속도 : " + myCar2.maxSpeed);
        System.out.println("현재속도 : " + myCar2.speed);
        // 3. 객체 내 필드의 값 수정
        myCar2.speed = 60;
        System.out.println("수정된 속도 : " + myCar2.speed);

        Car2 yourCar2 = new Car2(); // 202 번지(203번지[503번지] 204번지 205번지)
        System.out.println("제작회사 : " + yourCar2.company);

        System.out.println("현재속도 : " + yourCar2.speed);
    }
}
