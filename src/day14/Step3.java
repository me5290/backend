package day14;

public class Step3 {
    public static void main(String[] args) {
        // 1. 객체 생성
        Car myCar = new Car();

            // mtCar.tire = null;

        // 2. 객체의 필드 값 수정 => 타이어 장착
        myCar.tire = new Tire();
        myCar.run();

        myCar.tire = new HankookTire();
        myCar.run();

        myCar.tire = new KumhoTire();
        myCar.run();
    }
}
