package Homework.BTMang;

public class FindIndex {
    public static boolean findIndexOfElement(int array[], int element){
        boolean check = false;
        //int index;
        for (int i = 0; i < array.length; i++){
            if (array[i] == element){
                check = true;
                System.out.println("Vị trí của phần tử " + element + " là: " + i);
            }
        }
        if (!check){
            System.out.println("Không tìm thấy phần tử " + element + " trong mảng");
        }

        return check;
    }
    public static void main(String[] args) {
        int mang1[] = new int[]{10,20,30,40};
        int element1 = 50;
        findIndexOfElement(mang1, element1);
    }
}
