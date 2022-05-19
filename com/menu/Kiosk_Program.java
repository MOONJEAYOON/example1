package com.menu;

import java.util.Scanner;

public class Kiosk_Program implements IProgramLifecycle {

    Scanner scan;// 스캐너 변수
    Menu[] menus;// 메뉴 변수
    int menuNum;

    // 프로그램 시작 함수
    @Override
    public void start() {
        IProgramLifecycle.sayHello();
        scan = new Scanner(System.in);// 스캐너 초기화
        createMenus();// 메뉴들을 Menu Class 객체로 생성
        input_print();// 프로그램 시작문구 출력
        count();//메뉴 번호 확인
        cost(menuNum);//메뉴 가격 출력
    }

    @Override
    public void stop() {
        IProgramLifecycle.super.stop();
        System.out.println("^0^");
        scan.close();// 스캐너 종료
    }

    // 프로그램 시작문구 출력
    public void input_print() {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("------------------------------");
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d) %s(%d원) \n", menus[i].getNum(), menus[i].getName(), menus[i].getPrice());
        }
    }
    public void count() {
        while (true) {
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
            if (!scan.hasNextInt()) {
                scan.next(); //값이 숫자가 아니면 버린다.
                System.err.println("숫자만 입력해 주세요.");
                continue;
            }
            menuNum = scan.nextInt();
            if (menuNum > menus.length || menuNum <= 0) {
                System.out.println("메뉴의 번호를 잘못 입력하셨습니다.");
            } else break;
        }
    }

    // 메뉴들을 Menu Class 객체로 생성
    public void createMenus() {
        menus = new Menu[4];
        menus[0] = new Menu(1, "김밥", 1000);
        menus[1] = new Menu(2, "계란 김밥", 1500);
        menus[2] = new Menu(3, "총무 김밥", 1000);
        menus[3] = new Menu(4, "떡볶이", 2000);
    }
    //2. 수량 입력

    public void cost(int num) {
        System.out.println("------------------------------");
        int menuCount;
        while (true) {
            System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
            System.out.println("(※ 최대 주문 가능 수량 : 99)");
            if (!scan.hasNextInt()) {
                scan.next(); //값이 숫자가 아니면 버린다.
                System.err.println("숫자만 입력해 주세요.");
            } else break;
        }
        menuCount = scan.nextInt();

        if (menuCount > 99 || menuCount <= 0) {
            System.out.println("주문 가능 수량을 잘못 입력하셨습니다.");
            cost(num);
        } else {
            output_print(menuCount * menus[num - 1].getPrice());
        }
    }
    // 결과 출력 함수
    private void output_print(int result) {
        System.out.printf("총금액은 %,d 입니다.", result);
        System.out.println("\n[안내]이용해 주셔서 감사합니다.");
    }


}
