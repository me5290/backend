package day13.Step4.pakage2;

import day13.Step4.pakage1.A;

public class D extends A {
    public D(){
        super();
    }

    public void method1(){
        this.field = "value";   // 상속을 통해서 가능
        this.method();          // 상속을 통해서 가능
    }

    public void method2(){
        //A a = new A();          // 직접 객체 생성해서 사용은 불가능
        //a.field = "value";      // 직접 객체 생성해서 사용은 불가능
        //a.method();             // 직접 객체 생성해서 사용은 불가능
    }
}
