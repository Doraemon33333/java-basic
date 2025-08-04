package day4.ifexample;
import java.util.Scanner;
public class ifPractice03 {
    public static void main(String[] args) {
        // 숙제 1 : 태어난 해가 윤년인지 확인하여 결과를 출력하세요
        // 4년마다 윤년임. 100년 마다 평년 ,단 400년 마다 무조건 윤년
        // 2001, 1900년 -> 평년 2004, 2000 -> 윤년

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("년도 입력 하세요 : "); //

            int a = input.nextInt();

            if(a == 0){
                break;
            }

            if(a % 400 == 0) {
            System.out.println(a + "년은 윤년 입니다");
            }

            else if(a % 100 == 0){
            System.out.println(a + "년은 평년 입니다");
            }

            else if(a % 4 == 0){
            System.out.println(a + "년은 윤년 입니다");
            }

            else{
            System.out.println(a + "년은 평년 입니다");
            }
            System.out.println();

        }

    }

}
