package day20;

public class Step4 {
    // 1. 매개변수 문자의 길이를 알려주는 함수
    public static void printLength(String data){
        // ------------ 예외가 발생할것 같은 코드 ------------
        try{
            int result = data.length();             // .(도트) : 참조객체의 인스턴스 멤버 호출
            System.out.println("문자 수 : " + result);
        }
        // ------------ 만약 try{}안에 예외가 발생하면 catch 실행 ------------
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            // System.out.println(e.toString());
            // e.printStackTrace();
        }// ------------ ====================== ------------
        finally {
            System.out.println("마무리 실행");
        }
    }
    public static void main(String[] args) {
        // 1. [실행예외] NullPointerException
        printLength("ThisIsJAVA");
        printLength(null);            // null이면 참조가 없으므로 .(도트) 불가능

        // 2. [일반예외] ClassNotFoundException
        try {
            Class.forName("java.lang.String");
            Class.forName("java.lang.String2");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");

        // 3. [다중 catch 가능] NumberFormatException
        String[] array = {"100" , "1oo"};
        for(int i = 0 ; i <= array.length; i++){
            try {
                int value = Integer.parseInt(array[i]);
            }catch (NumberFormatException e){
                System.out.println("1 숫자로 변환할수 없습니다" + e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("2 배열 인덱스가 초과됨" + e.getMessage());
            }
            System.out.println("상위 예외클래스");
        }
    }
}
