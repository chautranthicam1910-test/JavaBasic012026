package Operator;

import com.sun.source.tree.IfTree;

public class DemoOperator1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 3;

        String s = (a % b == 0) ? "a chia het cho b " : "a khong chia het cho b";
        String s1;
        if (a % b == 0){
            s1 = "a hia het";
        }
        else {
            s1 = "KHong chia het";
        }

        System.out.println(a+1);

//        System.out.println(s);
//        System.out.println(s1);
//        System.out.println( a % b);
//        System.out.println(a++);
//        System.out.println(b--);
//        System.out.println(a+=2);
//        System.out.println(b-=2);
//        System.out.println(a*=3);
//        System.out.println(a++);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(a/=2);
//        System.out.println(b++);
//        System.out.println(b+=2);
//        System.out.println(a%=b);
    }
}
