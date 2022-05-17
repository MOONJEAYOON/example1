import java.util.Scanner;

//[인공지능 프로그램 V1]
//        ==============================
//        [System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : 1000
//        [안내] 입력된 광고비는 1000 원 입니다.
//        [안내] AI의 예측(클릭 수)은  2001회 입니다.
//        알파고 y = (a * x) + b
//            2001 = (a * 1000) + b
//            2001 = (2 * 1000) + 1
public class Ai_V1 {
    public static void main(String[] args) {
        // 사용자의 입력을 받기 위한 Scanner 객체를 생성합니다.
        Scanner sc = new Scanner(System.in);
        // 시스템 프로그램 안내 출력문을 정의합니다.
        System.out.println("[인공지능 프로그램 V1]");
        System.out.println("=".repeat(30));
        System.out.print("[System] 예측에 영향을 주는 원인(광고비)의 값을 알려주세요 (단위 원) : ");

        int x = sc.nextInt();
        double a, b, y;
        a = 2;
        b = 1;

        y = (a * x) + b;
        System.out.printf("[안내] 입력된 광고비는 %d 원 입니다.\n", x);
        System.out.printf("[안내] AI의 예측(클릭 수)은%6.0f회 입니다.", y);
    }

}
