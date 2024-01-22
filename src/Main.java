import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String[] time2 = time.split(" ");
        int hour = Integer.parseInt(time2[0]);
        int min = Integer.parseInt(time2[1]);
        if (min-45 < 0){
            if(hour == 0){
                hour = 24;
            }
            min = 60 - (45-min);
            System.out.println((hour-1)+" "+min);
        }else {
            System.out.println(hour+" "+(min-45));
        }
    }
}