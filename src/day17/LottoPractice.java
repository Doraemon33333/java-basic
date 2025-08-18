package day17;

import java.util.Arrays;

public class LottoPractice {
    public static void main(String[] args) {
        int n;
        int[] lotto = new int[6];
        for (int k = 0; k < 30; k++) {

            System.out.print("정렬 전 : ");
            for (int i = 0; i < 6; i++) {
                while (true) {
                    n = (int) (Math.random() * 9 + 1); // 그냥하면 중복뜨는데

                    int j;
                    for (j = 0; j < i; j++) {
                        if (n == lotto[j]) {
                            break;
                        }
                    }

                    if (j == i) {
                        lotto[i] = n;
                        System.out.print(lotto[i] + " ");

                        break;
                    }

                }

            }
            System.out.println();
            System.out.print("정렬 후 : ");
            /*for (int i = 0; i < lotto.length; i++) {
                for (int j = i + 1; j < lotto.length; j++) {
                    if (lotto[i] > lotto[j]) {
                        int temp = lotto[j];   //ex) 3이랑 1 이있다 치자 , 원래l 에 1인데 temp에 1, lotto[l] = 3으로 바꿔치기 그리고 j 는 1로바꾼 temp다시
                        lotto[j] = lotto[i];
                        lotto[i] = temp;
                    }

                }
                System.out.print(lotto[i] + " ");

            }*/


            /*for (int i = 0; i < lotto.length; i++) {
                int bouble = 0;
                for (int j = 0; j < lotto.length - 1 - i; j++) {
                    if (lotto[j] > lotto[j + 1]) {
                        int temp = lotto[j + 1];
                        lotto[j + 1] = lotto[j];
                        lotto[j] = temp;
                        bouble++;
                    }

                }
                if (bouble == 0) {
                    break;
                }

            }
            for (int i = 0; i < lotto.length; i++) {
                System.out.print(lotto[i] + " ");

            }*/

            Arrays.sort(lotto); // 사실 이거 하나면 된다고?
            for (int i = 0; i < lotto.length; i++) {
                System.out.print(lotto[i] + " ");

            }

            System.out.println();
            System.out.println("---------");
        }
    }
}
