package StaticJava;

import pages.LoginPage;

public class LoginTestCMS {
    public void test01_LoginSuccess(){
        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.window_size);
        LoginPage loginPage = new LoginPage();
        loginPage.loginSuccess("admin@example.com", "123456");

        System.out.println("Test success");
    }

    public void test02_LoginFailWithEmailInvalid(){
        System.out.println(ConfigData.browser);
        System.out.println(ConfigData.window_size);
        LoginPage loginPage = new LoginPage();
        loginPage.loginFail("admin@example.com", "123456");

        System.out.println("Test failed");

    }
}
