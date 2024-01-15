package team과제.team과제2;

import java.util.Random;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member[] memberArray = new Member[100];
        Service[] serviceArray = new Service[100];
        int num = 0;

        while(true){
            System.out.println("============== 메뉴 ===========");
            System.out.println(" 1.로그인 | 2.회원가입 | 3.종료 ");
            System.out.println("============================");
            System.out.print("선택 > ");
            int ch = scanner.nextInt();
            boolean btn = false;

            if(ch==1){
                System.out.print("아이디를 입력해주세요 : ");
                String id = scanner.next();
                System.out.print("비밀번호를 입력해주세요 : ");
                String pw = scanner.next();

                for(int i=0; i<memberArray.length; i++){
                    if(memberArray[i].id.equals(id) && memberArray[i].pw.equals(pw)){
                        System.out.println("로그인 성공!");
                        System.out.println(memberArray[i].toString());
                        btn = true;
                        num = memberArray[i].memberNum;
                        break;
                    }
                }
            }else if(ch==2){    // else if start
                System.out.print("아이디를 입력해주세요 : ");
                String id = scanner.next();
                System.out.print("비밀번호를 입력해주세요 : ");
                String pw = scanner.next();
                System.out.print("이름을 입력해주세요 : ");
                String name = scanner.next();
                System.out.print("주민등록번호를 입력해주세요 : ");
                String rrn = scanner.next();
                System.out.print("핸드폰번호를 입력해주세요 : ");
                String phone = scanner.next();
                Member.count++;
                Member member = new Member(id, pw, name, rrn, phone);
                for (int i=0; i<memberArray.length; i++){
                    if(memberArray[i]==null){
                        memberArray[i]=member;
                        System.out.println("회원가입 성공");
                        break;
                    }
                }
            }   // else if end
            while(btn){
                Service service = new Service();
                for(int i = 0; i < serviceArray.length; i++){
                    if( serviceArray[i] != null && serviceArray[i].memberNum == num){
                        System.out.println("============= 서비스 메뉴 ==========");
                        System.out.println(" 1.사용현황 | 2.구독연장 신청 | 3.종료");
                        System.out.println("==================================");
                        System.out.print("선택 > ");
                        int serviceMenu = scanner.nextInt();

                        if(serviceMenu == 1){
                            Random random = new Random();
                            if(service.volume==10){
                                System.out.println(serviceArray[i].volume + "중 " + random.nextInt(10) + "만큼 사용하셨습니다.");
                            }else if(service.volume==50){
                                System.out.println(serviceArray[i].volume + "중" + random.nextInt(50) + "만큼 사용하셨습니다.");
                            }else if(service.volume==100){
                                System.out.println(serviceArray[i].volume + "중" + random.nextInt(100) + "만큼 사용하셨습니다.");
                            }
                        }else if(serviceMenu == 2){
                            System.out.println("연장할 개월수를 입력해주세요.");
                            System.out.print("개월수 : ");
                            int month = scanner.nextInt();

                        }else if(serviceMenu == 3){
                            break;
                        }
                    }else{
                        System.out.println("============== 구독신청 ===========");
                        System.out.println(" 1.Basic | 2.Standard | 3.Premium");
                        System.out.println("=================================");
                        System.out.print("선택 > ");
                        int no = scanner.nextInt();

                        if(no==1){
                            service.basic(num);
                            System.out.println("Basic : 6900원");
                            System.out.print("결제 할 금액 : ");
                            int pay = scanner.nextInt();

                            for(int j = 0; j < serviceArray.length; j++){
                                if(serviceArray[j] == null){
                                    serviceArray[j] = service;
                                }
                            }

                            if(service.price == pay){
                                System.out.println("구독신청이 완료 되었습니다.");
                            }
                        }else if(no==2){
                            service.standard(num);
                            System.out.println("standard : 9900원");
                            System.out.print("결제 할 금액 : ");
                            int pay = scanner.nextInt();

                            for(int j = 0; j < serviceArray.length; j++){
                                if(serviceArray[j] == null){
                                    serviceArray[j] = service;
                                }
                            }

                            if(service.price == pay){
                                System.out.println("구독신청이 완료 되었습니다.");
                            }
                        }else if(no==3) {
                            service.premium(num);
                            System.out.println("premium : 12900원");
                            System.out.print("결제 할 금액 : ");
                            int pay = scanner.nextInt();

                            for(int j = 0; j < serviceArray.length; j++){
                                if(serviceArray[j] == null){
                                    serviceArray[j] = service;
                                }
                            }

                            if (service.price == pay) {
                                System.out.println("구독신청이 완료 되었습니다.");
                            }
                        }
                    }
                }
            }
        }

    }
}

