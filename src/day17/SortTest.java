package day17;

public class SortTest {
    public static void main(String[] args) {
        double[] ar = {1.5, 3, 10.2, 33.1, 2.35};
        System.out.print("정렬 전 : ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "  ");

        }
        System.out.println();
        System.out.print("교환 정렬 후 : ");
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    double temp;
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }

            }

        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "  ");

        }
        System.out.println();
        System.out.print("버블 정렬 후 : ");
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length - 1 - i; j++) {
                if (ar[j] > ar[j + 1]) {
                    double temp;
                    temp = ar[j];
                    ar[j] = ar[i];
                    ar[i] = temp;
                }
            }

        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + "  ");

        }


        System.out.println();
        String[] hira = {"う", "あ", "い", "お", "え"};

        for (int i = 0; i < hira.length; i++) {
            System.out.print(hira[i] + " ");
        }
        for (int i = 0; i < hira.length; i++) {
            for (int j = i + 1; j < hira.length; j++) {
                if (hira[i].charAt(0) > hira[j].charAt(0)) {
                    String temp;
                    temp = hira[j];
                    hira[j] = hira[i];
                    hira[i] = temp;
                }

            }


        }
        System.out.println();
        for (int i = 0; i < hira.length; i++) {
            System.out.print(hira[i] + " ");
        }
    }
}
