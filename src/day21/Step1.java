package day21;

public class Step1 {
    public static void main(String[] args) {
        try {
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("예외처리 : " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException{
        // throws : 예외 떠넘기기
        Class.forName("java.lang.String2");
    }
}
