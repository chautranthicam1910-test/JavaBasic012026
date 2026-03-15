package BT_JavaBasic4;

public class VongLapFOR {
    public static void main(String[] args) {
        int max = 50;
        int count = 0;

        System.out.println("Số chẵn là: ");
        for (int i = 0; i <= max; i++){
            if (i % 2 == 0){
                System.out.println(i);
                count++;
            }
        }

        //System.out.println(count);
        int arraySoChan[] = new int[count];
        int index = 0;

        for (int i = 0; i <= max; i++){
            if (i % 2 == 0){
                arraySoChan[index] = i;
                //System.out.println(arraySoChan[index]);
                index++;
            }
        }

        System.out.println("Mảng số chẵn là: ");
        for (int i = 0; i < arraySoChan.length; i++){
            System.out.println(arraySoChan[i]);
        }
    }
}
