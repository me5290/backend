package day22;

public class Applicant <T>{
    // <T> : 제네릭타입

    // 1. 필드
    public T kind;

    // 2. 생성자
    public Applicant(T kind){
        this.kind = kind;
    }
}
