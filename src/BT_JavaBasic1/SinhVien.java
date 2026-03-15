package BT_JavaBasic1;

public class SinhVien {
    static String major = "Information Technology";
    String studentID = "B150538";
    String phone = "0985702711";
    static String email = "chautranthicam1910@gmail.com";

    public void displayInfo(){
        String name = "Tran Thi Cam Chau";
        System.out.println("Họ tên: " + name);
        System.out.println("Chuyên ngành: " + major);
        System.out.println("Mã sinh viên: " + studentID);
    }
    public static void main(String[] args) {
        SinhVien object = new SinhVien();
        object.displayInfo();
        System.out.println("Tuổi: " + ThongTin.age);
        System.out.println("Số điện thoại: " + object.phone);
        System.out.println("Địa chỉ: " + ThongTin.address);
        System.out.println("Địa chỉ email: " + email);
    }
}
