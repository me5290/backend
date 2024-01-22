import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");
        String A = array[0];
        String B = array[1];
        String C = array[2];
        System.out.println(Integer.parseInt(A)+Integer.parseInt(B)+Integer.parseInt(C));
    }
}