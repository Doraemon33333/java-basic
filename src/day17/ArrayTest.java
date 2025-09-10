package day17;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        //1차원배열
        String s[] = new String[3];
        s[0] = new String("aaa");
        s[1] = new String("bbb");

        //기본 10개 배열이 생김
        ArrayList<Integer> list = new ArrayList<>();

        //Integer i = new Integer(1);

        list.add(1);
        list.add(100);
        list.add(513);
        System.out.println(list.get(0));
        System.out.println(list.size()); //실제 저장된 객체 개수
        //System.out.println(list.get(11));
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(0, 99);
        list.add(7);
        list.set(0, 88);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //int 저장할수있는 리스트 생성
        //반복적으로 정수 입력받아 리스트에 저장
        //숫자가 아닌값을 입력하면 반복종료
        // 전체 입력받은 숫자들의 평균, 평균 보다 큰 값들만 출력
        ArrayList<Integer> list2 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 15656065; i++) {
            try {
                System.out.print("입력 " + (i + 1) + " : ");
                int a = input.nextInt();
                list2.add(a);
            } catch (InputMismatchException e) {
                break;
            }
        }
        for (int i = 0; i < list2.size() - 1; i++) {
            System.out.print(list2.get(i) + ", ");
        }
        System.out.println(list2.get(list2.size() - 1));
        System.out.println(list2);

        for (int i = 0; i < list2.size(); i++) {
            for (int j = 0; j < list2.size() - 1 - i; j++) {
                if (list2.get(j) > list2.get(j + 1)) {
                    int temp;
                    temp = list2.get(j + 1);
                    list2.set((j + 1), list2.get(j));
                    list2.set(j, temp);
                }
            }
        }

        System.out.println("정렬 후 : " + list2);
        //Collections.sort(list2);

        int sum = 0;
        for (int i = 0; i < list2.size(); i++) {
            sum += list2.get(i);
        }
        double heikin = (double) sum / (list2.size());
        System.out.println("合計 : " + sum);
        System.out.printf("平均　： %.2f%n", heikin);

        System.out.print("平均以上　： ");
        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) > heikin) {
                System.out.print(list2.get(i) + " ");
            }

        }
        //어레이로 로또 ㅋㅋ


    }
}
