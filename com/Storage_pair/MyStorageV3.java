package com.Storage_pair;
import java.util.HashMap;
import java.util.Scanner;

public class MyStorageV3 {
    Scanner scan = new Scanner(System.in);
    HashMap<String,Integer> prod = new HashMap<>();

    //0. 기능
    void navi(){
        int num;
        while (true) {
            System.out.print("1. 물건 정보(제품명) 등록하기\n" +
                    "2. 물건 정보(제품명) 등록 취소하기\n" +
                    "3. 물건 넣기 (제품 입고)\n" +
                    "4. 물건 빼기 (제품 출고)\n" +
                    "5. 프로그램 종료\n" +
                    "------------------------------\n" +
                    "[System] 원하는 기능의 번호를 입력하세요 :");
            num = scan.nextInt();
            scan.nextLine();
            switch(num) {
                case 1:
                    prod_input();
                    break;
                case 2:
                    prod_remove();
                    break;
                case 3:
                    prod_amount_add();
                    break;
                case 4:
                    prod_amount_decrease();
                    break;
                case 5:
                    break;
            }
            show_item();
            if(num==5) {
                scan.close();
                System.out.println("[System] 프로그램을 종료합니다.\n" +
                        "[System] 감사합니다.");
                break;
            }
        }
    }
    //1. 물건 정보(제품명) 등록하기
     void prod_input(){
         System.out.print("[System] 제품 등록을 원하는 제품명을 입력하세요 :");
         String name = scan.nextLine();
         System.out.println("[System]등록이 완료됬습니다.");
         prod.put(name,0);


    }
    //2. 물건 정보(제품명) 등록 취소하기
     void prod_remove(){
         System.out.print("[System] 제품 등록 취소를 원하는 제품명을 입력하세요 :");
         String name = scan.nextLine();
         if (prod.containsKey(name)) {
           prod.remove(name);
             System.out.println("[System] 제품 취소가 완료됬습니다.");
         } else {
             System.out.println("[System] 제품명이 없습니다.");
         }
    }
    //3. 물건 넣기 (제품 입고)
     void prod_amount_add(){
         System.out.print("[System] 수량을 추가할 제품명을 입력하세요 : ");
         String name = scan.nextLine();

         if (prod.containsKey(name)) {
             System.out.print("[System] 추가할 수량을 입력해주세요 : ");
             int c = scan.nextInt();
             prod.put(name,prod.get(name) + c);
         } else {
             System.out.println("[System] 제품명이 없습니다.");
         }
    }
    //4. 물건 빼기 (제품 출고)
     void prod_amount_decrease(){
         System.out.print("[System] 출고를 진행할 제품명을 입력하세요 : ");
         String name = scan.nextLine();

         if (prod.containsKey(name)) {
             System.out.print("[System] 원하는 출고량을 입력하세요 : ");
             int c = scan.nextInt();
             if (prod.get(name) - c < 0) {
                 System.out.println("[System] 재고가 부족합니다.");
             } else {
                 prod.put(name, prod.get(name) - c);
             }
         } else {
             System.out.print("[System] 제품명이 없습니다.");
         }
    }
    //5. 재고 조회
     void prod_search(Scanner s, String[] products){

    }

    void show_item(){
        System.out.println("[System] 현재 등록된 제품 목록 ▼");
        for (String key : prod.keySet()) {
            System.out.printf("%s : %d개\n",key,prod.get(key));
        }

    }
    public static void main(String[] args) {
        MyStorageV3 myStorageV3 = new MyStorageV3();
        myStorageV3.navi();


    }


}
