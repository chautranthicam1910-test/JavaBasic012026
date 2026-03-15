package BT_JavaBasic2;

public class Calculator {
    public int tongHaiSoNguyen(int number1, int number2){
        return number1 + number2;
    }

    public double tichHaiSoThuc (double number3, double number4){

        return number3 * number4;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int tong = calculator.tongHaiSoNguyen(2500, 9000);
        System.out.println("Tổng hai số nguyên là: " + tong);

        double tich = calculator.tichHaiSoThuc(145, 64);
        System.out.println("Tích hai số thực là: " + tich);
    }
}
