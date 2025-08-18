package day15;

public class HaiRetsu {
    public static void main(String[] args) {
        int siu[] = new int[5];
        int siu2[];
        siu2 = new int[5];

        int siu3[] = {10, 20, 30, 40, 50};

        System.out.println(siu3);
        System.out.println(siu3[0]);
        siu3[0]++;
        System.out.println(siu3[0]);
        //System.out.println(siu3[6]);

        for (int i = 0; i < siu3.length; i++) {
            System.out.print(siu3[i]);
            System.out.print(" ");
        }


    }
}
