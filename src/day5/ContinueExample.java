package day5;

public class ContinueExample {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        for (i = 0; i <= 10; i++) {

            //ex) 홀수일때는 건너뛰기 ( 짝수만 더하기)
            if (i % 2 != 0){
                System.out.println("건너뛴 값"+ i);
                continue;
            }
            sum += i;

        }
        System.out.println("반복문을 나온 시점에 i는 "+ i +"이고, 합은 "+ sum + "입니다");
    }
}
