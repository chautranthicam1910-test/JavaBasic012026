package BT_JavaBasic5;

import java.util.HashMap;
import java.util.Map;

public class EmployeeInformations {
    public static Map<String, String> addInformations(){
        Map<String, String> map = new HashMap<>();
        map.put("Họ tên", "Trần Thị Cẫm Châu");
        map.put("Mã NV", "1976309");
        map.put("Ngày sinh", "19/10/1997");
        map.put("Địa chỉ", "An Giang");
        map.put("Bộ phận", "IT");

        return map;

    }

    public static void main(String[] args) {
        Map<String, String> employee = addInformations();
        for (String key : employee.keySet()) {
            System.out.println(key + " : " + employee.get(key));
        }
    }
}
