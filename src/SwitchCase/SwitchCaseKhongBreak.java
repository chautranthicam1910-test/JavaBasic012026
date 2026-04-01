package SwitchCase;

public class SwitchCaseKhongBreak {
    public static void main(String[] args) {
        int number = 30;

        //Switch - case khong dung break, se thuc thi cac khoi lenh sau gia tri phu hop, mac du khong thoa dieu kien
        switch (number){
            case 10:
                System.out.println("10");

            case 20:
                System.out.println("20");

            case 30:
                System.out.println("30");

            default:
                System.out.println("Not in 10, 20, 30");
        }
    }
}
