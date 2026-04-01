package Homework.BTMang;

import java.lang.reflect.Array;

public class TinhTong {
    public static void main(String[] args) {
        int mangSoNguyen[] = new int[]{1,2,3,4,5};
        int tong = 0;
        for (int index = 0; index < mangSoNguyen.length; index++){
            System.out.println(mangSoNguyen[index]);
            tong += mangSoNguyen[index];
        }
        System.out.println("Tong la: " + tong);
    }
}
