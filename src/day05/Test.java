package day05;

public class Test {
    public static void main(String[] args) {
        int 단 = 2;
        while (단 <= 9){
            int 곱 = 1;
            while (곱 < 9){
                곱++;
                System.out.println(단*곱);
            }
            단++;
        }
    }
}
