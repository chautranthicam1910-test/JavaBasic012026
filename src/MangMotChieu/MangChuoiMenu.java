package MangMotChieu;

public class MangChuoiMenu {
    public static void main(String[] args) {
        String menuList[] = new String[]{"Dashboard", "Customers", "Projects", "Tasks"};

        boolean checkMenu = false;

        for (String menu : menuList){
            System.out.println(menu);

            if (menu.equals("Dashboard")){
                checkMenu = true;
                break; //Thoat luon vong lap FOR
            }
        }
        if (checkMenu == true){
            System.out.println("Co chua menu Dashboard.");
        }else {
            System.out.println("KHONG TON TAI menu Dashboard.");
        }
    }

}
