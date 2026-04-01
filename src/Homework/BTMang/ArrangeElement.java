package Homework.BTMang;

import java.util.Arrays;

public class ArrangeElement {
    public static int[] arrangeElement(int mang[]){
        for (int i = 0; i < mang.length - 1 ; i++){
            for (int j = 0 ; j < mang.length - i - 1; j++){
                if (mang[j] > mang[j + 1]){
                    int temp = mang[j];
                    mang[j] = mang[j + 1];
                    mang[j + 1] = temp;
                }
            }
        }

        return mang;
    }

    public static void main(String[] args) {
        int mangMain[] = new int[]{5,2,8,1};
        System.out.println("Mảng sau khi sắp xếp tăng dần là: " + Arrays.toString(arrangeElement(mangMain)) );
    }
}
