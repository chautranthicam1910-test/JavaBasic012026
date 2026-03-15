package BT_JavaBasic5;

import java.util.ArrayList;

public class SoChanUsingArrayList {
    public static void kiemTraSoChan(){

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max = 50;

        for (int i = 0; i <= max; i++){
            if (i % 2 == 0){
                list.add(i);
            }
        }
        System.out.println("Mảng số chẵn là: " + list);

    }
}
