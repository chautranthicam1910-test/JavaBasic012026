package Variables;

public class Local_Variables {

    String name = "Chou Chou"; //Day la bien toan cuc
    public static int age = 29; // Day la bien static

    //Day la cau truc Ham
    public void getInfo1(){
        String address = "Ho Chi Minh"; // bien local
        System.out.println(address);
        System.out.println(name);
        System.out.println(age);
    }

    public void getInfo2(){
        String address = "An Giang";
        System.out.println(address);
        System.out.println(name);
    }



    public static void main(String[] args) {
        System.out.println(age); //Goi truc tiep
        System.out.println(Local_Variables.age); // Thong qua class

        //Phai thong qua doi tuong class thi moi goi duoc cac doi tuong trong class
        Local_Variables demo2 = new Local_Variables();
        System.out.println(demo2.name);
        demo2.getInfo1();
        demo2.getInfo2();
    }
}








