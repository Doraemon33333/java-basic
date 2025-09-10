package day17;

import java.util.ArrayList;

public class ArrayLotto {
    public static void main(String[] args) {
        ArrayList<Integer> lotto = new ArrayList<>();
        while (lotto.size() < 6) {
            int n = (int) (Math.random() * 45 + 1);

            /*boolean check = false;
            for (int i = 0; i < lotto.size(); i++) {
                if (n == lotto.get(i)) {
                    check = true;
                    break;
                }
            }

            if (check == false) {
                lotto.add(n);
            }*/
            if (!lotto.contains(n)) {
                lotto.add(n);
            }
        }
        System.out.println(lotto);
    }
}
