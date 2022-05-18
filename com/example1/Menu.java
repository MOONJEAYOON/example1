package com.example1;

public class Menu {
    // 메뉴의 번호;
    private int num;
    // 메뉴의 이름;
    private String name;
    // 메뉴 가격
    private int price;

    Menu() {

    }

    Menu(int num, String name, int price) {
        this.num = num;
        this.name = name;
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
