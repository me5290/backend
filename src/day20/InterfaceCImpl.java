package day20;

public class InterfaceCImpl implements InterfaceC{
    // 자식인터페이스를 구현할때 부모인터페이스도 구현 해야한다
    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl.methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl.methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl.methodC() 실행");
    }
}
