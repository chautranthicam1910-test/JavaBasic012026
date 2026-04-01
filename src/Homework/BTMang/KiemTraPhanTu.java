package Homework.BTMang;

public class KiemTraPhanTu {
    public static boolean checkElement(int mang[], int element){
        boolean check = false;

        for (int i = 0; i < mang.length; i++){
            if (mang[i] == element){
                check = true;
                break;
            }
        }
        if (check){
            System.out.println("Có " + element + " trong mảng");
        }
        else {
            System.out.println("Không có " + element + " trong mảng");
        }
        return check;
    }
    public static void main(String[] args) {
        /*int checkElement[] = new int[]{1,2,3,4};
        int element = 5;
        boolean check = false;
        for (int i = 0 ; i < checkElement.length; i++){
            if (checkElement[i] == element){
                check = true;
                break;

            }
        }

        if (check){
            System.out.println("Có " + element + " trong mảng");
        }
        else {
            System.out.println("Không có " + element + " trong mảng");
        }*/
        int mang[] = new int[]{1,2,3,4};
        checkElement(mang,6);

    }
}
