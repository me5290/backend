package day15;

public class Step1 {
    public static void main(String[] args) {
        // 1. 객체 생성
        Driver driver1 = new Driver();  // 운전자1
        Driver driver2 = new Driver();  // 운전자2

        // 2. 객체 생성
        Bus bus = new Bus();
        driver1.drive(bus);  // 버스운전

        // 3. 객체 생성
        Taxi taxi = new Taxi(); // 택시A 생성
        driver1.drive(taxi); // 택시A로 변경

        driver2.drive(taxi);    // 운전자2 택시A 운행
        driver1.drive(taxi);    // 운전자1 택시A 운행
        Taxi taxi2 = new Taxi(); // 택시B 생성
        driver2.drive(taxi2);   // 운전자2 택시B 운행
    }
}
