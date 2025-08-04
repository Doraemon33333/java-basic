package day3;
// 1.Scanner를 사용하기 위해 import한다.

import java.util.Scanner;

public class ScannerCample {
    public static void main(String[] args) {
        // 2. Scanner 객체를 생성한다
        Scanner input = new Scanner(System.in);

        // 3. Scanner 객체를 사용하여 입력을 받는다
        System.out.println("이름을 입력하세요");
        String name = input.nextLine();  // String 쓰면 이름
        System.out.println("안녕하세요 " + name + "님");

        System.out.println("숫자를 입력해주세요:");
        int a = input.nextInt();
        System.out.println("입력 완료" + a);

        // 4. 여러개를 입력할때는 1,2는 제외 3번을 반복
        int b = input.nextInt();
        int c = input.nextInt();
        // 5. 입력받은 정수값 사용하기
        int result = a+b+c;
        System.out.println("입력받은 값의 합계=" + result);

        System.out.println("변경하실 이름을 입력해주세요 :");   // 이게 안나오네 안기다려주고 그러면 뭐를 넣어야겠죠
        input.nextLine();
        String newname = input.nextLine(); //왜냐하면 위에 22라인에서 엔터로 끝냈는데 그게 남아있어서 바로위에 하나 더 넣어줘야함
        // 고로 버퍼에 남아있는 개행문자(\n)을 제거하는거임
        System.out.println("변경된 이름은 "+ newname);

        input.close(); // 리소스 해제



    }




}
