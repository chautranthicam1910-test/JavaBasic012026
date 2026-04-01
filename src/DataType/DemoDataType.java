package DataType;

public class DemoDataType {
    public static void main(String[] args) {
        String name = "Selenium Java";
        char kiTu = '$';

        //Kieu du lieu so NGUYEN
        byte number1 = -127;
        short number2 = 30000;
        int number3 = 2100000000; //Thuong dung trong Test Automation
        long number4 = 300000000000L;

        boolean checkGia = ((String.valueOf(number2)) + kiTu).equals("32000$");
        System.out.println(checkGia);

        //Kieu so THUC
        float laiSuatNganHang = 5.2F;
        double soPi = 3.1398549740954586; //Thuong dung trong Test Automation

        //Kieu du lieu DUNG SAI
        boolean check = true;
        boolean result = false;
        String actual = "Login successfully";
        String expected = "Login success";
        boolean checkCondition = actual.equals(expected);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(laiSuatNganHang);
        System.out.println(soPi);
        System.out.println(checkCondition);

    }
}
