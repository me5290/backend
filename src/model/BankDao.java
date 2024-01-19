package model;

import java.util.ArrayList;

public class BankDao {
    // 싱글톤
    private BankDao(){}
    private static BankDao memberDAO = new BankDao();
    public static BankDao getInstance(){return memberDAO;}

    // 배열 생성(ArrayList)
    ArrayList<BankDto> bankArray = new ArrayList<>();


    public boolean 계좌생성(BankDto){
        if(은행번호 == 1){
            bankArray.add(은행객체);
        }else if(은행번호 == 2){
            bankArray.add(은행객체);
        }else if(은행번호 == 3){
            bankArray.add(은행객체);
        }
        return true;
    }

    public int 계좌찾기(){
        // 배열 찾아서 입력한 계좌번호가 저장된 계좌번호랑 일치하면 1 반환
        for(int i = 0; i < bankArray; i++){
            if(bankArray.get(i).get계좌번호().equals(은행객체.get계좌번호())){
                return bankArray.get(i).get은행코드();
            }
        }

        return 0;
    }

    public boolean 입금(){
        for(int i = 0; i < bankArray; i++){
            // 배열에 있는 계좌와 입력한 계좌가 일치하면 해당 인덱스의 금액에 입력한 금액 +
            if(bankArray.get(i).get계좌번호().equals(은행객체.get계좌번호())){
                bankArray.get(i).get금액() += 입력한입금액;
            }

            // 은행별로 마일리지,쿠폰,포인트 배열에 저장
            if(은행번호 == 1){
                bankArray.add(마일리지);
            }else if(은행번호 == 2){
                bankArray.add(쿠폰);
            }else if(은행번호 == 2){
                bankArray.add(포인트);
            }

            return true;
        }
        return false;
    }

    public boolean 출금(){
        for(int i = 0; i < bankArray; i++){
            // 배열에 있는 계좌와 입력한 계좌가 일치하면 해당 인덱스의 금액에 입력한 금액 -
            if(bankArray.get(i).get계좌번호().equals(은행객체.get계좌번호())){
                bankArray.get(i).get금액() -= 입력한출금액;
            }
            return true;
        }
        return false;
    }
}
