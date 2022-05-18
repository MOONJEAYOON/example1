package com.menu;
import java.util.Scanner;

public class Kiosk_Program {
    Scanner scan = new Scanner(System.in);
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
        for (int i = 0; i < menus.length; i++) {
            System.out.printf("%d) %s(%d원) ", menus[i].getNum(), menus[i].getName(), menus[i].getPrice());
        }
        int menuNum;
        while (true) {
            System.out.print("입력하세요 : ");
            if (!scan.hasNextInt()) {
                scan.next(); //값이 숫자가 아니면 버린다.
                continue;
            }
            menuNum = scan.nextInt();
            if (menuNum > menus.length || menuNum <= 0) {
                System.out.println("메뉴의 번호를 잘못 입력하셨습니다.");
            } else break;
        }
        count(menuNum);


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

    public void count(int num) {
        int totalPrice = 0;
        System.out.println("------------------------------");
        System.out.println("[안내]선택하신 메뉴의 수량을 입력하여 주세요.");
        System.out.println("(※ 최대 주문 가능 수량 : 99)");
        int c = scan.nextInt();

        System.out.println("총금액은 " + c * menus[num-1].getPrice());
    }
    //3. 결제 금액 출력


    //3. 결제 금액 출력
}
