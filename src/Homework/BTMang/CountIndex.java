package Homework.BTMang;

public class CountIndex {
    public static int countIndex(int mang[], int element){
        int count = 0;
        for (int i = 0; i < mang.length; i++){
            if (mang[i] == element){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int mang[] = new int[]{1,2,2,3,2,4};
        int element = 5;
        System.out.println("Số lần xuất hiện của " + element + " là: " + countIndex(mang, element));
    }
}
