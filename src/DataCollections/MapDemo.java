package DataCollections;

import StaticJava.ConfigData;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {

        //-Dang key - value
        //Key bị trùng, giữ key cuối cùng

        //Khai bao Map
        Map<String, String> map = new TreeMap<>();

        //Thêm dữ liệu
        map.put("browser", "chrome");
        map.put("os", "windows");
        map.put("headless", "true");
        map.put("browser", "edge");
        map.put("screenshot", "true");

        //In du lieu tu map
        //Truy xuất giá trị theo từng key
        System.out.println(map.get("os"));
        System.out.println("====================");

        //Get hết giá trị của key và value
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //xóa theo key
        System.out.println("====================");
        map.remove("headless");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //Kiem tra Key va Value
        System.out.println("====================");
        System.out.println(map.containsKey("headless"));
        System.out.println(map.containsValue("edge"));

        if (map.containsKey("browser") == true){
            System.out.println(map.get("browser"));
        }else {
            System.out.println(ConfigData.browser);
        }

    }



}
