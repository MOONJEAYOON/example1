import java.util.Scanner;

public class StarCraft {
    public static void main(String[] args) {

        String unitName1; // 유닛1 이름
        String unitName2; // 유닛2 이름
        int[] unitStatus1 = new int[3]; // 유닛1 스테이터스
        int[] unitStatus2 = new int[3]; // 유잇2 스테이터스

        Scanner scan = new Scanner(System.in);
        System.out.println("[안내] TRPG 스타크래프트 시작합니다.");
        System.out.println("[안내] 자신의 유닛 정보를 입력해 주세요.");

        /* 유닛1 정보 입력 */
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 : ");
        unitName1 = scan.nextLine();
        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 : (Ex 50)");
        while (!scan.hasNextInt()) { //값이 숫자인지 판별
            scan.next(); //값이 숫자가 아니면 버린다.
            System.err.print("에러! 숫자가 아닙니다. \n유닛 [공격력] 을 입력해 주세요 : (Ex 50)");
        }
        unitStatus1[0] = scan.nextInt();

        System.out.print("유닛 [방어력] 을 입력해 주세요 : (Ex 1)");
        while (!scan.hasNextInt()) { //값이 숫자인지 판별
            scan.next(); //값이 숫자가 아니면 버린다.
            System.err.print("에러! 숫자가 아닙니다. \n유닛 [방어력] 을 입력해 주세요 : (Ex 1)");
        }
        unitStatus1[1] = scan.nextInt();

        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 : (Ex 100)");
        while (!scan.hasNextInt()) { //값이 숫자인지 판별
            scan.next(); //값이 숫자가 아니면 버린다.
            System.err.print("에러! 숫자가 아닙니다. \n[시스템] 유닛 [체력] 을 입력해 주세요 : (Ex 100)");
        }
        unitStatus1[2] = scan.nextInt();

        /* 유닛1 정보 출력 */
        Units unit1 = new Units(unitName1, unitStatus1[0], unitStatus1[1], unitStatus1[2] );
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.\n[공격력] : %d\n[방어력] : %d\n[체력] : %d\n", unit1.getName(), unit1.getAttack(), unit1.getDefense(), unit1.getStamina());


        System.out.println("=".repeat(30));
        System.out.println("[안내] 상대 유닛 정보를 입력해 주세요.");

        /* 유닛2 정보 입력 */
        scan.nextLine();
        System.out.print("[시스템] 유닛 [이름] 을 입력해 주세요 : ");
        unitName2 = scan.nextLine();

        System.out.print("[시스템] 유닛 [공격력] 을 입력해 주세요 : (Ex 50)");
        while (!scan.hasNextInt()) { //값이 숫자인지 판별
            scan.next(); //값이 숫자가 아니면 버린다.
            System.err.print("에러! 숫자가 아닙니다. \n유닛 [공격력] 을 입력해 주세요 : (Ex 50)");
        }
        unitStatus2[0] = scan.nextInt();

        System.out.print("유닛 [방어력] 을 입력해 주세요 : (Ex 1)");
        while (!scan.hasNextInt()) { //값이 숫자인지 판별
            scan.next(); //값이 숫자가 아니면 버린다.
            System.err.print("에러! 숫자가 아닙니다. \n유닛 [방어력] 을 입력해 주세요 : (Ex 1)");
        }
        unitStatus2[1] = scan.nextInt();

        System.out.print("[시스템] 유닛 [체력] 을 입력해 주세요 : (Ex 100)");
        while (!scan.hasNextInt()) { //값이 숫자인지 판별
            scan.next(); //값이 숫자가 아니면 버린다.
            System.err.print("에러! 숫자가 아닙니다. \n[시스템] 유닛 [체력] 을 입력해 주세요 : (Ex 100)");
        }
        unitStatus2[2] = scan.nextInt();

        /* 유닛2 정보 출력 */
        Units unit2 = new Units(unitName2, unitStatus2[0], unitStatus2[1], unitStatus2[2] );
        System.out.println("[안내] 생성된 유닛 정보는 다음과 같습니다.");
        System.out.printf("[안내] %s 유닛이 게임에 참여하였습니다.\n[공격력] : %d\n[방어력] : %d\n[체력] : %d\n", unit2.getName(), unit2.getAttack(), unit2.getDefense(), unit2.getStamina());

        System.out.println("=".repeat(30));
        System.out.println("-".repeat(30));

        /* 전투 */
        while (unit2.getStamina() > 0) {
            unit2.battle(unit2.getStamina(),unit1.getAttack());
            System.out.printf("[안내] [%s]유닛이 [공격] 하였습니다.\n", unit1.getName());
            System.out.printf("[안내] 상대 유닛의 남은 [체력]은 %d 입니다.\n", unit2.getStamina());
            System.out.println("-".repeat(30));
        }
        scan.close();
    }
}


class Units {
    private String name;
    private int attack;
    private int defense;
    private int stamina;

    public Units (String name, int attack, int defense, int stamina) {
        this.name = name;
        this.attack = attack;
        this.defense = defense;
        this.stamina = stamina;
    }

    public String getName() {
        return name;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getStamina() {
        return stamina;
    }
    public void battle(int x, int y) {
        this.stamina = x - y;
        if (this.stamina < 0) {
            this.stamina = 0;
        }
    }

}