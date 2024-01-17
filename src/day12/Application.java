package day12;

import day12.view.MainView;

// 실행클래스
public class Application {
    public static void main(String[] args) {
        // 다른 클래스 메소드를 호출하는 방법

        // 1. 해당 메소드가 인스턴스 메소드일 경우
        // new MainView().run();
        // 2. 해당 메소드가 인스턴스 메소드일 경우
        // MainView mainView = new MainView();
        // mainView.run();
        // 3. 싱글톤
        MainView.getInstance().run();
        // 4. 해당 메소드가 static일 경우
        // MainView.run();
    }
}
/*
    소프트웨어 개발시 사용되는 디자인패턴 MVC
        MVC : 사용자인터페이스, 데이터 및 논리제어 구현하는데 있어 사용되는 패턴
        - 관심사 분리 해서 업무의 분리와 향상된 관리
        M : model   : JAVA,DB           : 데이터 객체
            - DAO : 데이터 접근 객체(DATA Access Object)
            - DTO : 서로 다른 레이어/계층에 이동하는 객체(DATA Transfer Object)
            - VO  : 불변 데이터 객체 / 수정금지(Value Object)
        V : view    : HTML,CSS,JS       : (입출력)화면 구현
        C : control : JAVA              : MODEL 과 VIEW 중계역할하고 제어
            - controller   : 제어역할 , 유효성검사
            - service      : 비즈니스 로직(중요기능 로직)
*/