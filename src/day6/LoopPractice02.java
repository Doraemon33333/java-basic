package day6;
import java.util.Scanner;

public class LoopPractice02 {
    public static void main(String[] args) {
        //정수 2개를 입력받아 시작값과 끝값으로서 시작값~끝값의 합계는 sum이다  출력하세
        //끝값이 시작값보다 작ㄱ게 입력하면 작은수부터 큰수까지의 합계는 ~~~
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("시작 숫자 : ");
            int a = input.nextInt();

            System.out.print("끝 숫자 : ");
            int b = input.nextInt();

            int sum = 0;

            if(a == 0 && b == 0){
                break;
            }

            if(a <= b){
                System.out.print(a+ "부터");
                for (   ; a <= b ; a++) {
                    sum += a;
                }
                System.out.printf("%d 까지의 합계는 %d 이다%n%n", b, sum);
            }

            else{
                System.out.print(b + "부터");
                for (   ; b <= a ; b++) {
                    sum += b;
                }
                System.out.printf("%d 까지의 합계는 %d 이다%n%n", a, sum);
            }

        }



        /*System.out.printf("%n");
        System.out.println("------------------");

        System.out.print("시작 숫자 : ");
        int c = input.nextInt();

        System.out.print("끝 숫자 : ");
        int d = input.nextInt();
        int sum2 = 0;
        int cc =c;

        if(c > d){
            cc = d;
            int temp = d;
            d = c;
            c = temp;
            }
        for (   ; c <= d ; c++){
            sum2 += c;
        }
        System.out.printf("%d 부터 %d 까지의 합은 %d 이다", cc, d, sum2);*/
    }
}
