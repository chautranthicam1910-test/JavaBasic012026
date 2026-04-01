package Homework;

public class InstanceVariable {
    String name;
    int age;
    public InstanceVariable(String name){
        this.name = name;

    }

    public void setAge(int age){
        this.age = age;
    }

    public void showStudent(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    public static void main(String[] args) {
        InstanceVariable sinhvien = new InstanceVariable("Nguyen Van A");
        sinhvien.setAge(21);
        sinhvien.showStudent();
    }
}
