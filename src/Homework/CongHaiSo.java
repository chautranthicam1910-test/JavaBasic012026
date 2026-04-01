package Homework;

import java.util.Scanner;

public class CongHaiSo {
    public static int tinhTong(int number1, int number2){
        int sum = number1 + number2;
        System.out.println("Tong la: " + sum );
        return sum;
    }

    public static void main(String[] args) {
        tinhTong(12, 49);

        int numberInput1, numberInput2, tong;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        numberInput1 = scanner.nextInt();

        System.out.println("Nhập số thứ hai: ");
        numberInput2 = scanner.nextInt();


        tong = numberInput1 + numberInput2;
        System.out.println("Tổng 2 số là: " + tong);

        scanner.close();

    }
}
