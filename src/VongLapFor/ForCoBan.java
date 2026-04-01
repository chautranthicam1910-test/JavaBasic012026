package VongLapFor;

public class ForCoBan {
    public static void main(String[] args) {

        //Khai bao vong lap FOR
        for (int i = 1; i <= 10; i+=2){
            System.out.println("Selenium Java " + i);
        }

        //Dung de lap doan code
        for (int i = 1; i <= 5; i++) {
            System.out.println("Navigate to url... " );
            System.out.println("Enter email: ");
            System.out.println("Enter password: ");
            System.out.println("Click Login button");
            System.out.println("Verify alert message success display");
            System.out.println("=======================================");
        }

        //Duyet Mang hoac ArrayList de kiem tra tung phan tu trong mang

        //Khai bao mang
        int mang1[] = new int[]{2,5,6,8,9,24,0};
        String  mang2[] = new String[]{"Apple", "Strawberry", "PineApple"};
        for (int i = 0; i < mang1.length; i++) {
            System.out.println(mang1[i]);
        }

        //Duyet mang chuoi
        for (int i = 0; i < mang2.length; i++){
            System.out.println(mang2[i]);
        }
    }
}
