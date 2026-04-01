package XuLyChuoiString;

public class XuLyChuoi {
    public static void main(String[] args) {

        String str1 = "Selenium Java - Web Test Automation";
        String str2 = "Playwright Java - Web&API Test Automation";

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println(str1.charAt(14)); //Bat dau vi tri 0
        System.out.println(str2.length());
        System.out.println(str1.substring(16)); // cat chuoi tu vi tri thu 16
        System.out.println(str1.substring(16,19));

        System.out.println(str1.contains("Selenium"));
        System.out.println(str1.contains("Playwright"));

        System.out.println(str1.equals("Selenium Java - Web Test Automation"));
        System.out.println(str1.equals("Java"));

        String textTableFooter = "Showing 1 to 25 of 40 entries";

        //Lay so 40 trong chuoi
        //Cach 1 - Khong on dinh bang cach 2
        System.out.println(textTableFooter.substring(19,21));

        //Cach 2 - Tach chuoi thanh mang gia theo khoang trang
        String mangGiaTriSauTach[] = textTableFooter.split(" ");
        System.out.println(mangGiaTriSauTach[5]);

        //Kiem tra chuoi co bi rong khong
        System.out.println("=================");
        String chuoi1 = "";
        String chuoi2 = " ";
        System.out.println(chuoi1.isEmpty());
        System.out.println(chuoi2.isEmpty());
        System.out.println(chuoi1.isBlank());
        System.out.println(chuoi2.isBlank());

        boolean check = str1.isEmpty();
        System.out.println(check);

        //Noi chuoi lai voi nhau
        String str3 = "Thư viện automation: " + "Selenium";
        System.out.println(str3);
        System.out.println(str3.concat(" Playwright"));

        String actual = "27 / 40";
        String expected = "27" + " / " + mangGiaTriSauTach[5];
        System.out.println(expected);
        System.out.println(actual.equals(expected));

        //Thay thế chuỗi
        System.out.println(str1.replace("Java", "C#"));
        String str4 = "Selenium Java Selenium C# Selenium Python";
        System.out.println(str4.replaceAll("Selenium", "Playwright"));

        //Kiem tra doan dau va doan cuoi
        System.out.println("startsWith: " + str1.startsWith("Selenium"));
        System.out.println("endsWith: " + str1.endsWith("Test Automation"));

        String str5 = " Kiểm thử phần mềm ";
        System.out.println(str5);
        System.out.println(str5.trim());

        System.out.println(str5.trim().replaceAll(" ", ""));
        System.out.println(str5.trim().replaceAll(" ", "").length());

        //Chuyen doi so thanh chuoi
        String stringNumber = "1000";
        int number = 2000;
        System.out.println(stringNumber + 5);
        System.out.println("Chuyển số thành chuỗi: " + String.valueOf(number) + 10); // ghép chuỗi
        System.out.println("Chuyển chuỗi số thành số: " + Integer.valueOf(stringNumber) + 5); // in ra chuỗi, do là nó đang hiểu cộng chuỗi
        System.out.println("Chuyển chuỗi số thành số: " + (Integer.valueOf(stringNumber) + 5));
    }
}
