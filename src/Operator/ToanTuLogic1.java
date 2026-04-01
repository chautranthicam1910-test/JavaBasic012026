package Operator;

public class ToanTuLogic1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println((a > b) && (b < c));

        int age = 20;
        boolean hasID = true;
        String address = "Ha Noi";

        //Toan tu AND &&
        if (age >=20 && hasID == true && address.equals("Can Tho")){
            System.out.println("Duoc phep vao");
        }
        else {
            System.out.println("Khong truy cap duoc");
        }

        //To tu OR ||
        boolean isAdmin = false;
        boolean isManager = false;

        if (isAdmin || isManager){
            System.out.println("Co quyen truy cap");
        }
        String alertMessage = "Category has been inserted successfully";
        String alertMessageActual = "Dung Selenium de lay";
        String categoryName = "Dung Selenium de lay";

        if ((alertMessageActual.equals(alertMessage)) && categoryName.equals("Category 01")){
            System.out.println("Add new category successfully");
        }
        else {
            System.out.println("Add new category failed");
        }

        if (!isAdmin){
            System.out.println("Chuyen den trang Admin");
        }

        if (!(a > 5)){
            System.out.println(a);
        }
        else {
            System.out.println("a be hon 5");
        }

        if (!(age > 20)){
            System.out.println("Duoc xet di NVQS");
        }

        int number1, number2;
        number1 = number2 = 5;
        System.out.println( number1 + number2);
    }
}
