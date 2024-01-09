package day06;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시간(hhmmss형식) : ");
        String time = scanner.nextLine();
        System.out.println("시간(숫자) : ");
        String second = scanner.nextLine();

        String result = "";
        //입력받은 time에서 second 만큼 지난 시간을 hhmmss형식으로 출력
        int ss = Integer.parseInt(time.substring(4,6));
        ss += Integer.parseInt(second);

        int mm = Integer.parseInt(time.substring(2,4));
        mm += (ss/60);  // 초를 60으로 나눈값의 몫을 분에 더한다

        int hh = Integer.parseInt(time.substring(0,2));
        hh += (mm/60);  // 분을 60으로 나눈값의 몫을 시에 더한다
        // 만약에 시가 24시를 넘기면
        hh = hh>24 ? hh-24 : hh;

        result = (hh < 10 ? "0"+hh : hh) + ":" + (mm%60 < 10 ? "0"+mm%60 : mm%60) + ":" + (ss%60 < 10 ? "0"+ss%60 : ss%60);

        System.out.println("result = " + result);

        /*
            예)
                time = 14:59:30
                second = 70
                result = 15:00:40
        */
    }
}
