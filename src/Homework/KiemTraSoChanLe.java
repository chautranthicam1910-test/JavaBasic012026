package Homework;

import java.awt.*;
import java.util.Scanner;

public class KiemTraSoChanLe {

    public static void soChanLe(int number){

        if (number % 2 == 0){
            System.out.println(number + " la so chan");
        }else {
            System.out.println(number + " la so le");
        }
    }

    public static void soChanLeTuBanPhim_While(){
        int number1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 1 số từ bàn phím: ");

        while (!scanner.hasNextInt()){
            System.out.println("Số bạn vừa nhập không phải là số nguyên. Vui lòng nhập lại số nguyên.");
            scanner.next();
            System.out.println("Nhập lại: ");
        }
        number1 = scanner.nextInt();
        soChanLe(number1);

    }

    public static void inputNumberUsingForLoop(){
        Scanner scanner = new Scanner(System.in);
        int number2;
        System.out.println("Nhập 1 số từ bàn phím: ");
        for (;;){
            if (!scanner.hasNextInt()){
                System.out.println("Số bạn vừa nhập không phải là số nguyên. Vui lòng nhập lại số nguyên: ");
                scanner.next();
            }else {
                number2 = scanner.nextInt();
                soChanLe(number2);
                break;
            }
        }
        scanner.close(); //thường không cần, nếu đọc file thì cần giải phóng resource
    }

    public static void checkNumberKeyBoard(){
        Scanner scanner = new Scanner(System.in);
        final int MAX_TRY = 3;
        int number3;
        boolean isValid = false;

        System.out.println("Nhập 1 số từ bàn phím: ");
        for (int i = 1; i <= MAX_TRY; i++){
            if (scanner.hasNextInt()){
                number3 = scanner.nextInt();
                soChanLe(number3);
                isValid = true;
                break;

            }else {
                System.out.println("Bạn đã nhập sai lần thứ " + i + "/" + MAX_TRY + ". Hãy nhập lại: ");
                scanner.next();
            }

        }
        System.out.println(isValid);
        if (!isValid){
            System.out.println(!isValid);
            System.out.println("Bạn đã nhập sai quá số lần cho phép. Kết thúc chương trình.");

        }
    }

    public static void main(String[] args) {
        //int num = 11;
        //soChanLe(num);
        //soChanLeTuBanPhim_While();
        //inputNumberUsingForLoop();
        checkNumberKeyBoard();
    }
}
