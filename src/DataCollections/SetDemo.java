package DataCollections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        //-Luu tru gia tri KHONG trung lap
        //-KHONG cho phep luu theo vi tri

        //Set<String> setTabBrowser = new HashSet<>();
        Set<String> setTabBrowser = new TreeSet<>(Collections.reverseOrder()); // Giảm dần

        setTabBrowser.add("AN123456");
        setTabBrowser.add("PG123456789");
        setTabBrowser.add("AN123456");
        setTabBrowser.add("MN385676KOP98");

        //In ra
        for (String tab : setTabBrowser){
            System.out.println(tab);
        }

//        List<String> list = new ArrayList<>(setTabBrowser);
//        Collections.sort(list);
//
//        for (String tab : list){
//            System.out.println(tab);
//        }

        System.out.println("==========================");
        System.out.println(setTabBrowser.contains("PG123456789"));

        System.out.println("==========================");
        setTabBrowser.remove("AN123456");
        for (String tab : setTabBrowser){
            System.out.println(tab);
        }
    }
}
