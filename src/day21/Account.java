package day21;

public class Account {
    // 1. 필드
    private long balance;

    // 2. 생성자
    public Account(){}

    // 3. 메소드
    public long getBalance(){
        return balance;
    }

    // 4. 메소드
    public void deposit(int money){
        balance += money;
    }

    // 5. 메소드
    public void withdraw(int money) throws InsufficientException{
        if (balance < money){
            throw new InsufficientException("잔고부족"); // 우리가 만든 예외 클래스로 예외발생 시키기
        }
        balance -= money;
    }
}
