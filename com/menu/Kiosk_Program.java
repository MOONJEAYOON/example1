package com.menu;
import java.util.Scanner;

public class Kiosk_Program {
    Kiosk_Program() {
     //   createMenus();
    }

    int count;
    Menu[] menus;

    public void start() {
        createMenus();
        input_print();
    }


    // 프로그램 시작문구 출력

    public void input_print() {
        System.out.println("[안내]안녕하세요. 김밥천국에 오신 것을 환영합니다.");
        System.out.println("------------------------------");
        System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
        for (int i = 0;i < menus.length; i++) {
            System.out.printf("%d) %s(%d원) ",menus[i].getNum(), menus[i].getName(),menus[i].getPrice());
        }
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()) { //값이 숫자인지 판별
            scan.next(); //값이 숫자가 아니면 버린다.
            System.err.print("에러! 숫자가 아닙니다.");
        }
        int nenuNum = scan.nextInt();
        if (nenuNum > menus.length || nenuNum <= 0) {
            System.out.println("[안내]원하시는 메뉴의 번호를 입력하여 주세요.");
            for (int i = 0;i < menus.length; i++) {
                System.out.printf("%d) %s(%d원) ",menus[i].getNum(), menus[i].getName(),menus[i].getPrice());
            }
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
    //1. 메뉴 선택
    public int count(int c) {
        return c;
    }

    //2. 수량 입력
    //3. 결제 금액 출력
}
