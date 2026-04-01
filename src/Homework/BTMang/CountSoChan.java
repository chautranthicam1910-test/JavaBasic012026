package Homework.BTMang;

public class CountSoChan {
    public static void main(String[] args) {
        int mang[] = new int[]{1,2,4,7,8};
        int count = 0;
        for (int index = 0; index < mang.length; index++){
            if (mang[index] % 2 == 0){
                count++;
            }
        }
        System.out.println("Có " + count + " số chẵn trong mảng");
        int mangSoChan[] = new int[count];
        int index2 = 0;
        for (int index = 0; index < mang.length; index++){
            if (mang[index] % 2 == 0){
                mangSoChan[index2] = mang[index];
                index2++;
            }
        }
        System.out.println("Mảng số chẵn là: ");
        for (int i = 0; i < mangSoChan.length; i++){
            System.out.println(mangSoChan[i]);
        }

    }
}
