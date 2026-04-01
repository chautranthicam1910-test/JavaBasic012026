package PhuongThuc;

public class HamKhongTraVe {

    //Khai bao ham khong tra ve gia tri de dung lai

    public void showInfo(){
        String name = "Lan";
        String address = "Dak Lak";
        System.out.println(name);
        System.out.println(address);
    }

    public void displayVersion(){
        String version = "1.0.0";
        System.out.println(version);
    }

    public static void main(String[] args) {
        HamKhongTraVe object1 = new HamKhongTraVe();

        object1.showInfo();
        object1.displayVersion();

        String version = "1.0.0";
    }
}
