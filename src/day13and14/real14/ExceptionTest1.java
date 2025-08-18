package day13and14.real14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        try {
            System.out.print("number gogo : ");
            a = input.nextInt();
            System.out.print("number2 gogo : ");
            b = input.nextInt();
            c = a / b;
            System.out.println(c);

        } catch (InputMismatchException e) {
            System.out.println("너 잘못 입력했어");
            //잘못입력할 가능성이 있는곳, 넥스트인트 a b 인가?、먼저 캐치 한 후 해당안되면 밑으로 넘어가는 느낌
        } catch (ArithmeticException e) {
            System.out.println("0으로 못나눈다");
            return; //매서드 종료
        } catch (Exception e) {
            System.out.println(" z");
        }
        // 이런거 할 때 상위타입을 먼저쓰면 앞에서 다받아버림, 하위클래스를 앞으로 둬야함

        finally {
            System.out.println("무조건 실행, 주로 마지막 작업"); // 이친구는 리턴 해도 들렸다 감
        }
        System.out.println("??");

    }
}
