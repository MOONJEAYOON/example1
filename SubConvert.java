import java.util.Scanner;

public class SubConvert {
    public static void main(String[] args) {
        //[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : admin
        //[시스템] 유튜브 계정의 비밀번호를 입력하세요{Ex - 0000} : 1234
        //[경고] 유튜브 계정의 아이디 및 비밀번호를 다시 확인해 주세요.
        Scanner scan = new Scanner(System.in);
        final String id = "admin";
        final String password = "1234";
        String[] ban_words = {"킹", "시발", "꺼저", "미친"};
        String[] change_words = {"열", "사랑", "용기", "희망"};

        System.out.print("[시스템] 유튜브 계정의 아이디를 입력하세요 {Ex - admin} : ");
        String signId = scan.next();
        System.out.print("[시스템] 유튜브 계정의 비밀번호를 입력하세요{Ex - 0000} : ");
        String signPassword = scan.next();
        if (signId.equals(id) && signPassword.equals(password)) {
            //[안내] 안녕하세요 admin님.
            //[안내] 유튜브 영상의 자막을 생성해 주세요.
            System.out.printf("[안내] 안녕하세요 %s님.\n",id);
        } else {
            System.out.println("[경고] 유튜브 계정의 아이디 및 비밀번호를 다시 확인해 주세요.");
            scan.close();
            return;
        }
        System.out.println("[안내] 유튜브 영상의 자막을 생성해 주세요.");
        scan.nextLine();
        String subtitle = scan.nextLine();

        //========================================
        //[알림] 프로그램의 금칙어 리스트입니다.
        //[킹, 시발, 꺼저, 미친]
        //========================================
        //[알림] 자막 순화 프로그램 결과입니다.
        System.out.println("=".repeat(30));
        System.out.println("[알림] 프로그램의 금칙어 리스트입니다.");
        System.out.println("[킹, 시발, 꺼저, 미친]");
        System.out.println("=".repeat(30));

        // 자막 순화 for문
        for (int i=0; i < ban_words.length; i++) {
            if (subtitle.indexOf(ban_words[i]) > -1) {
                subtitle = subtitle.replace(ban_words[i], change_words[i]);
            }
        }

        //>>> 아 열받아 사랑 열받네 희망
        //[안내] 프로그램을 종료합니다.
        System.out.printf(">>> %s\n",subtitle);
        System.out.println("[안내] 프로그램을 종료합니다.");
        scan.close();
    }
}
