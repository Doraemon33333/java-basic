package day5;

public class ForPractice {
    public static void main(String[] args) {
        // 1~@까지의 합이 100 이상일때 @와 100이상이 된 누산값을 출력하세요


        int sum = 0;
        int i = 0;
        // ctrl + space 자동완성?
        for (   ; ; i++) {
            sum += i;

            System.out.println(i + "회차 반복");

            System.out.println(sum);
            System.out.println("------------");

            if (sum >= 100){
                // 합이 100넘는 순간 빠지기 ㅋ
                break;
            }
        }
        System.out.println("반복문을 나온 시점(합이 100이 넘어가는 순간)에 i는 "+ i +"이고, 합은 "+ sum + "입니다");


    }
}

/*
표만들어 보기
i  | sum
0  |  0
1  |  1
2  |  3
3  |  6
4  |  10
5  |  15
   .
   .
   .
14 |  105   -> break로 빠져나오기
 */