package com.menu;

public interface IProgramLifecycle {
    abstract public void start();
    default public void stop() {
        System.out.println("프로그램이 종료 되었습니다.");
        sayGoodbye();
    }
    private void sayGoodbye() {
        System.out.println("다음에 또 만나요.");
    }
    static public void sayHello() {
        System.out.println("환영합니다.");
    }
}
