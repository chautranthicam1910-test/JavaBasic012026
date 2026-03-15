package BT_JavaBasic3;

import java.util.Scanner;

public class CauLenhIFELSE {

    private static final int NUMBER = 100;

    public static void soSanh(int n){

        if (n == NUMBER){
            System.out.println( n + " bằng " + NUMBER);
        } else if (n > NUMBER) {
            System.out.println( n + " lớn hơn " + NUMBER);
        }else {
            System.out.println( n + " nhỏ hơn " + NUMBER);
        }
    }
    public static void main(String[] args) {
        int n = 200;
        soSanh(n);

    }
}
