package day18;

import day18.view.MainView;

public class Application {
    public static void main(String[] args) {
        MainView.getInstance().run();
    }
}
/*
    - 다른 클래스내 메소드를 호출하는 방법

    // 1. 인스턴스 메소드
        MainView mainView = new MainView();
        mainView.run();

        // 2. 인스턴스 메소드
        new MainView().run();

        // 3. 싱글톤(인스턴스 메소드)
        MainView.getInstance().run();

        // 4. 정적 메소드(메소드가 static일 경우)
        MainView.run();
*/