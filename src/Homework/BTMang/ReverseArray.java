package Homework.BTMang;

public class ReverseArray {
    public static void main(String[] args) {
        int array[] = new int[]{1,2,3,4};
        int reverseArray[] = new int[array.length];

        for (int i = 0; i < array.length; i++){
            //System.out.println(array[i]);
            reverseArray[i] = array[array.length - 1 - i];
        }

        System.out.println("Mảng đảo ngược là: ");
        for (int index = 0; index < reverseArray.length; index++){
            System.out.println(reverseArray[index]);
        }
    }
}
