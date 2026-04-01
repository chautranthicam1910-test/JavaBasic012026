package DataType;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DemoVar {
    public static void main(String[] args) {
        var mynum = 5;
        var myDouble = 9.98;
        var myChar = 'D';
        var myBoolean = true;
        var myString = "Hello";

        var x = 9.99;
        x = 10;
        x = 9.9;

        //ArrayList<String> cars = new ArrayList(); //array without var
        var cars = new ArrayList();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(mynum);
        System.out.println(myDouble);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myString);
        System.out.println(cars);
    }

}
