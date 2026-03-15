package BT_JavaBasic3;

public class ToanTu {
    public static void main(String[] args) {

        //Toán tử Quan Hệ
        //So sanh 2 so
        int number1 = 10;
        int number2 = 20;
        if (number1 > number2){
            System.out.println(number1 + " lớn hơn " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " bé hơn " + number2);
        }else {
            System.out.println(number1 + " bằng " + number2);
        }

        System.out.println("======================================");

        //Kiem tra so âm, dương, bằng 0
        int number = 10;
        if (number > 0){
            System.out.println(number + " là số dương");
        } else if (number < 0) {
            System.out.println(number + " là số âm");
        }else {
            System.out.println(number + " bằng 0");
        }

        System.out.println("======================================");

        //Toán tử Logic
        //Miễn phí ship, Tổng tiền >= 200000, HOẶC là thành viên

        int tongTien = 35000;
        boolean laThanhVien = true;

        if (tongTien >=20000 || laThanhVien){
            System.out.println("Bạn được miễn phí ship");
        }else {
            int soTienCanThem = 20000 - tongTien;
            System.out.println("Hãy mua thêm " + soTienCanThem + "đ để được miễn ship");
        }

        System.out.println("======================================");

        //Kiem tra x có nằm trong khoảng 10 đến 20 không?
        int x = 30;
        if (x >= 10 && x <= 20){
            System.out.println("X có nằm trong khoảng 10 đến 20");
        }else {
            System.out.println("X nằm ngoài 10 và 20");
        }

        System.out.println("======================================");

        //Kiểm tra form hợp lệ, Đk hợp lệ khi:
        //username không rỗng
        //password có ít nhất 6 ký tự
        //age >= 18

        String username = "admin";
        String password = null;
        int age = 30;

        if (username != null && !username.isEmpty() && password != null && password.length() >= 6  && age >= 18){
            System.out.println("FORM hợp lệ");
        }else {
            System.out.println("FORM không hợp lệ");
        }

    }
}
