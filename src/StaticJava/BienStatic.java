package StaticJava;

public class BienStatic {

    public String email = "admin@example.com";
    public static String password = "123456";

    public static void main(String[] args) {
        BienStatic object1 = new BienStatic();

        System.out.println(object1.email);
        System.out.println(password); //Bien static co the goi truc tiep tu ham main
        System.out.println(BienStatic.password); //Bien static duoc cham goi thong qua ten class

        System.out.println(ConfigData.browser); // Bien static duoc goi tu class khac
    }
}
