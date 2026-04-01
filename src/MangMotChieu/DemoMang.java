package MangMotChieu;

public class DemoMang {

    public static void main(String[] args) {

        //Khai bao mang mot chieu

        //Mang kieu so nguyen (int)

        int mangSoNguyen[] = new int[3]; //Do dai mang la 3 phan tu

        //Them gia tri vao mang
        //Vi tri bat dau la 0
        mangSoNguyen[0] = 3;
        mangSoNguyen[1] = 10;
        mangSoNguyen[2] = 44;

        //Duyet mang dung vong lap FOR
        //System.out.println(mangSoNguyen.length);

        for (int i = 0; i < mangSoNguyen.length; i++) {
            System.out.println(mangSoNguyen[i]);
        }

        //=====================================================
        System.out.println("==================================");

        //Vua khai bao mảng + vừa khởi tạo giá trị cho mảng
        //Khong can quan tam kich co mang ban dau
        int mang2[] = new int[]{5, 10, 15, 20, 30, 35};

        System.out.println(mang2[5]);
        System.out.println("**********************************");

        for (int i = 0; i < mang2.length; i++) {
            System.out.println(mang2[i]);
        }

        System.out.println("**********************************");

        //FOR cải tiến
        for (int bien1 : mang2){
            System.out.println(bien1);
        }
    }
}
