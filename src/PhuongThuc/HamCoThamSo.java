package PhuongThuc;

public class HamCoThamSo {

    public int cong2So(int number1, int number2){
        return number1 + number2;
    }

    public void loginTestValidCredentical(String email, String password){
        System.out.println("Navigate to url...");
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + password);
        System.out.println("Click Login button");
        System.out.println("Verify login success");
    }

    public void loginTestWithInvalidEmail(String email, String password){
        System.out.println("Navigate to url...");
        System.out.println("Enter email: " + email);
        System.out.println("Enter password: " + password);
        System.out.println("Click Login button");
        System.out.println("Verify login fail");
    }

    public static void main(String[] args) {
        HamCoThamSo object1 = new HamCoThamSo();

        System.out.println(object1.cong2So(10, 11));
        object1.loginTestValidCredentical("admin@example.com", "123456");
        object1.loginTestWithInvalidEmail("email", "pass");
    }
}
