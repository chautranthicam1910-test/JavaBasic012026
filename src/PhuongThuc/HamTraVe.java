package PhuongThuc;

public class HamTraVe {

    //Khai bao ham CO gia tri tra de dung lai duoc

    public String getVersion(){
        String version = "2.0.0";

        return version;
    }

    public int getCategoryTotal(){
        int categoryTotal = 100;
        return categoryTotal;
    }

    public static void main(String[] args) {
        HamTraVe object1 = new HamTraVe();

        String version1 = object1.getVersion();
        System.out.println(version1);

        String version2 = object1.getVersion();
        System.out.println(version2);

    }
}
