package 조별과제3.controller;    // PACKAGE NAME

import java.util.Scanner;
import 조별과제3.model.BankDto;
import 조별과제3.model.KbDto;
import 조별과제3.model.ShDto;
import 조별과제3.model.NhDto;
import 조별과제3.model.BankDao;

public class Controller {   // CLASS START

// ==================================== 싱글톤 ==================================== //
    private static Controller controller = new Controller();    // 싱글톤 필드
    private Controller(){ } // 싱글톤 생성자
    public static Controller getInstance(){return controller;}  // 싱글톤 메소드
// ==================================== 계좌생성 ==================================== //
    public boolean 계좌생성(BankDto bankDto){   // m start
        // 계좌생성 //
        boolean result = BankDao.getInstance().계좌생성(bankDto);   // View -> Dao 객체 전달 후 결과 받기
            System.out.println("result = " + result); // 결과를 확인하자.
        return result;
    }   // m end
// ==================================== 입금 ==================================== //
    public boolean 입금(BankDto bankDto){ // m start
        boolean result = false;
        // 그냥 dto 받아서 dao 계좌찾기에 넘겨서 은행을 찾는다.
        int code = BankDao.getInstance().계좌찾기(bankDto);

        // 입금 //
        if(code == 1){  // 신한은행이면
            // 신한은행 객체 생성
            ShDto shdto = new ShDto();

            // 전달받은 계좌번호, 금액을 새로 만들 신한은행 객체로 새롭게 생성한다.
            shdto.set계좌번호(bankDto.get계좌번호());
            shdto.set금액(bankDto.get금액());
            int mileage = bankDto.get금액();
            shdto.set마일리지((int)(mileage * 0.05));

            // 신한은행 객체를 전달 해서 결과를 받는다.
            result = BankDao.getInstance().입금(shdto , code);
            System.out.println("result = " + result);
        }
        if(code == 2){  // 국민은행이면
            KbDto kbdto = new KbDto();

            // 전달받은 계좌번호, 금액을 새로 만들 신한은행 객체로 새롭게 생성한다.
            kbdto.set계좌번호(bankDto.get계좌번호());
            kbdto.set금액( bankDto.get금액());
            String coupon = "물티슈";
            kbdto.set쿠폰(coupon);

            // 국민은행 객체를 전달 해서 결과를 받는다.
            result = BankDao.getInstance().입금(kbdto ,code);
            System.out.println("result = " + result);
        }
        if(code == 3){  // 농협은행이면
            NhDto nhdto = new NhDto();

            // 전달받은 계좌번호, 금액을 새로 만들 신한은행 객체로 새롭게 생성한다.
            nhdto.set계좌번호(bankDto.get계좌번호());
            nhdto.set금액(bankDto.get금액());
            int point = bankDto.get금액();
            nhdto.set포인트((int) (point * 0.1));

            // 국민은행 객체를 전달 해서 결과를 받는다.
            result = BankDao.getInstance().입금(nhdto , code);
            System.out.println("result = " + result);
        }
        return result;
    }   // m end
// ==================================== 출금 ==================================== //
    public boolean 출금(BankDto bankDto){ // m start

        // 그냥 dto 받아서 dao 계좌찾기에 넘겨서 은행을 찾는다.
        boolean result = BankDao.getInstance().출금(bankDto);   // View -> Dao 객체 전달 후 결과 받기
        System.out.println("result = " + result); // 결과를 확인하자.
        return result;
    }   // m end

    // 조회
    public String 조회(BankDto bankDto){
        // 전달
        String str = BankDao.getInstance().조회(bankDto);
        return str;
    }
}   // CLASS END


// View에서 전달을 받고 Dao에게 객체를 전달해준다. Dao에서 연산을 하고 저장하고 결과를 받는다.
// View 기본 정보를 전발받고 Dao에게 전달을 해준다.
// ex 신한은행 111-111 박효성 -> Dao에게 전달 -> Dao에서 1이면 신한 2이면 국민 3이면 농협 해서 데이터 저장
// -> 처리 결과를 controller에서 전달 받고 view에 다시 전달

/*
선언 타입 : boolean 전달받을 매개변수 : Dto타입의 dto / View에서 전달을 받았다?
    public boolean 입금(Dto dto){
            System.out.println("dto = " + dto); // 매개변수 잘 받았는지 확인
            System.out.println("Controller.입금"); // 호출 잘 되는지 확인

        // 입금 //

        타입 : boolean인 result Dao 안에 입금 메소드에 dto 매개변수를 전달한다. Dao에게 전달을 한다.
        boolean result = Dao.getInstance().입금(dto);     View -> Dao 객체 전달 후 결과 받기
            System.out.println("result = " + result);   결과를 확인하자.
        return result;
    }
*/