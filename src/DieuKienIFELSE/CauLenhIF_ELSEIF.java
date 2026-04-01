package DieuKienIFELSE;

public class CauLenhIF_ELSEIF {

    public void checkRoleAndMenuDisplay(String role){
        if (role.equals("Admin")){
            System.out.println("Thay het 15 menu");
            //Dung automation de check du 15 menu
        } else if (role.equals("Customers")) {
            System.out.println("Thay duoc 5 menu");
            
        } else if (role.equals("Employee")) {
            System.out.println("Chuyen den trang UserHome");
            
        }else {
            System.out.println("Chuyen den trang Product Manager");
        }
    }
    //O day co the thay the thanh 4 IF van duoc

    public static void main(String[] args) {
        float diemTrungBinh = 1f;
        CauLenhIF_ELSEIF checkRole = new CauLenhIF_ELSEIF();

        checkRole.checkRoleAndMenuDisplay("User");

        if (diemTrungBinh >= 8){
            System.out.println("Hoc sinh gioi");
        } else if (diemTrungBinh < 8 && diemTrungBinh >= 6.5) {
            System.out.println("Hoc sinh kha");
        } else if (diemTrungBinh < 6.5 && diemTrungBinh >= 5) {
            System.out.println("Hoc sinh trung binh");
        } else if (diemTrungBinh < 5 && diemTrungBinh >= 2 ){
            System.out.println("Hoc sinh yeu");
        }else {
            System.out.println("O lai lop");
        }


    }

}
