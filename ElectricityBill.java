// 주택용 전기요금 (저압) 계산법
//저압의 경우 100kWh 이하는 kWh당 60.7원,
// 100kWh 초과는 125.9원,
// 200kWh 초과는 187.9원,
// 300kWh 초과는 280.6원,
// 400kWh 초과는 417.7원,
// 500kWh초과는 670.6원의 전력량 요금을 내야한다.
// 우리가 만들 전기 요금 계산기에는 99kWh, 150kWh, 250kWh, 301kWh, 450kWh, 510kWh  사용량에 해당하는 전기 요금을 출력해주세요.
public class ElectricityBill {

    public static void main(String[] args) {
        // 전기 사용량에 대한 배열
        int[] voltage = {99, 150, 250, 301, 450, 510};

        for (int i=0; i < voltage.length; i++) {
            priceBill(voltage[i]); // 영수증 출력을 위한 메소드 호출
        }
    }

    public static void priceBill(int value) {
        double price = 0;
        if (value <= 100){
            price = value * 60.7;
        } else if (value > 100 && value <= 200) {
            price = value * 125.9;
        } else if (value > 200 && value <= 300) {
            price = value * 187.9;
        } else if (value > 300 && value <= 400) {
            price = value * 280.6;
        } else if (value > 400 && value <= 500) {
            price = value * 417.7;
        } else {
            price = value * 670.6;
        }
        System.out.println("=".repeat(25));
        System.out.println(" 주택용 전기요금(저압) 계산기 ");
        System.out.println("=".repeat(25));
        System.out.println(value + "kWh의 전기 요금은 " + price + "원 입니다.");
    }
}
