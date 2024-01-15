package team과제.team과제2;

public class Service {
    // 필드
    int memberNum;
    String rating;
    double volume;
    String period;
    int price;

    // 생성자


    // 메소드
    void basic(int memberNum){
        this.memberNum = memberNum;
        this.rating = "Basic";
        this.volume = 10;
        this.period = "1month";
        this.price = 6900;
    }
    void standard(int memberNum){
        this.memberNum = memberNum;
        this.rating = "standard";
        this.volume = 50;
        this.period = "1month";
        price = 9900;
    }
    void premium(int memberNum){
        this.memberNum = memberNum;
        this.rating = "premium";
        this.volume = 100;
        this.period = "1month";
        price = 12900;
    }

    @Override
    public String toString() {
        return "Service{" +
                "memberNum=" + memberNum +
                ", rating='" + rating + '\'' +
                ", volume=" + volume +
                ", period='" + period + '\'' +
                ", price=" + price +
                '}';
    }
}
