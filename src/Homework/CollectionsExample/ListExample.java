package Homework.CollectionsExample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");


        System.out.println("Các phần tử của ArrayList");
        System.out.println("\t" + arrayList + "\n"); //In nguyên đối tượng list
        System.out.println("Duyệt phần tử của ArrayList bằng cách 1");
        for (String obj : arrayList){
            System.out.println(obj);
        }
        System.out.println("=======================");
        arrayList.add("C#");
        arrayList.remove("PHP");
        arrayList.add("Python");
        arrayList.remove("Python");
        arrayList.add(2, "GoLang");
        arrayList.remove(1);

        System.out.println("Duyệt phần tử của ArrayList bằng cách 2");
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }

        System.out.println(arrayList.contains("Python"));

        System.out.println("=======================");

        List<String> linkedList = new LinkedList<String>();
        linkedList.add("Apple");
        linkedList.add("Strawberry");
        linkedList.add("PineApple");
        linkedList.add("Mango");

        System.out.println("Các phần tử của LinkedList");
        System.out.println("\t" + linkedList + "\n");

    }
}
