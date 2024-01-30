package day21;

public class InsufficientException extends Exception{
    // 예외 클래스 만들기
    // 1. Exception 클래스로 부터 상속 받는다
    // 2. Exception 클래스로 부터 message 필드 사용

    public InsufficientException(){}

    public InsufficientException(String message){
        super(message);
    }
}
