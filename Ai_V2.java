import java.util.Scanner;

public class Ai_V2 {
    public static void main(String[] args) {
        // 사용자의 입력을 받기 위한 Scanner 객체를 생성합니다.
        Scanner sc = new Scanner(System.in);
        float a,b;
        float[] x_list;
        double y;

//[인공지능 프로그램 V2]
//        ==============================
//        [System] a 값을 입력하여 주세요 : 2
//        [System] b 값을 입력하여 주세요 : 1
//        ==============================
        System.out.println("[인공지능 프로그램 V2]");
        System.out.println("=".repeat(30));
        System.out.print("[System] a 값을 입력하여 주세요 : ");
        a = sc.nextFloat();
        System.out.print("[System] b 값을 입력하여 주세요 : ");
        b = sc.nextFloat();
        System.out.println("=".repeat(30));

//        [안내] 입력된 '광고비'는 다음과 같습니다.
//        1 번째) 580.0원	2 번째) 700.0원	3 번째) 810.0원	4 번째) 840.0원
        System.out.println("[안내] 입력된 '광고비'는 다음과 같습니다.");
        x_list = new float[]{580, 700, 810, 840};
        for (int i=0; i < x_list.length; i++) {
            System.out.printf("%s 번째) %6.1f원 ",i+1, x_list[i]);
        }
//        [안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다.
//        1 번째 예측) 1161.0회 방문
//        2 번째 예측) 1401.0회 방문
//        3 번째 예측) 1621.0회 방문
//        4 번째 예측) 1681.0회 방문
        System.out.println("\n[안내] AI의 '웹 페이지 방문자' 예측 결과는 다음과 같습니다.");
        for (int i=0; i < x_list.length; i++) {
            y = (a * x_list[i]) + b;
            System.out.printf("%s 번째) 예측) %6.1f회 방문 ",i+1, y);
        }
    }
}
