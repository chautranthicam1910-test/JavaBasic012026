package DataCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        //-Cho phep luu tru gia tri trung
        //- Du lieu có thu tu vi tri
        //Khai bao List dang 1 => Luu tru gia tri trung lap va co thu tu

        List<String> listMenu = new ArrayList<>();

        //Khai bao List dang 2 => lay list con trien khai thang con luon
        ArrayList<String> listMenu1 = new ArrayList<>();


        //Them phan tu vao List
        listMenu.add("Dashboard");
        listMenu.add("Customers");
        listMenu.add("Projects");
        listMenu.add("Tasks");
        listMenu.add("Dashboard");
        listMenu.add("Contracts");
        listMenu.add("Projects");

        //Get phan tu theo vi tri
        System.out.println("====================");
        System.out.println(listMenu.get(2));
        System.out.println("====================");


        //Duyet het List
        for (String menu : listMenu){
            System.out.println(menu);
        }

        System.out.println("====================");
        listMenu.add("Reports"); //Them phan tu moi voi gia tri chi dinh

        //Them phan tu theo vi tri chi dinh (bat dau vi tri la 0)
        listMenu.add(1, "Supports");

        for (String menu : listMenu){
            System.out.println(menu);
        }

        System.out.println("====================");
        listMenu.remove("Dashboard"); //Xoa phan tu theo gia tri Dashboard
        for (String menu : listMenu){
            System.out.println(menu);
        }

        //Kiem tra gia tri trong List
        System.out.println("====================");
        System.out.println("Kiem tra menu Reports: " + listMenu.contains("Reports"));

        //So sánh 2 List
        System.out.println("********************");
        List<String> listMenu2 = new ArrayList<>();

        //Them phan tu vao List
        listMenu2.add("Supports");
        listMenu2.add("Customers");
        listMenu2.add("Projects");
        listMenu2.add("Tasks");
        listMenu2.add("Dashboard");
        listMenu2.add("Contracts");
        listMenu2.add("Projects");
        listMenu2.add("Reports");

        for (String menu : listMenu2){
            System.out.println(menu);
        }

        System.out.println("So sanh 2 list: " + listMenu.equals(listMenu2));

        //Sap xep cac phan tu tang dan

        System.out.println("********************");
        Collections.sort(listMenu);
        for (String menu : listMenu){
            System.out.println(menu);
        }


    }
}
