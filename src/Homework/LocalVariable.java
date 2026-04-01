package Homework;

public class LocalVariable {
    public void sayHello(){
        int n=0; //Bien local chi su dung trong ham ma no duoc khai bao
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        LocalVariable demoLocal = new LocalVariable();
        demoLocal.sayHello();
    }
}
