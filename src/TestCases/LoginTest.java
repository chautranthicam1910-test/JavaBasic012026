package TestCases;

import PhuongThuc.HamTraVe;

public class LoginTest {

    public int testcasse01(){
        HamTraVe obj1 = new HamTraVe();

        return obj1.getCategoryTotal();
    }

    public static void main(String[] args) {
        LoginTest obj1 = new LoginTest();
        //int total = obj1.testcasse01();
        System.out.println("Gia trị: " + obj1.testcasse01());
    }
}
