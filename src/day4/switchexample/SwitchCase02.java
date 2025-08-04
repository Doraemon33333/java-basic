package day4.switchexample;

public class SwitchCase02 {
    public static void main(String[] args) {
        // 브레이크 없이도 스위치 동작하는 뭐시기
        // switch 화살표 문법
        // 케이스 내의 실행문을 실행한 뒤 바로 문을 빠져나가기



        int ranking = 1;
        String medalColor = "GOLD"; // 스위치에서는 문자열도 되고 숫자도 됨
        switch (medalColor) {
            case "GOLD" -> System.out.println("금메달 입니다"); // 원래 콜론 자리에 화살표??

            case "SILVER" -> System.out.println("은메달 입니다");

            case "BRONZE" -> System.out.println("동메달 입니다");

            default -> System.out.println("노메달 입니다");
        }

        String medalColor2 = "SILVER"; // 스위치에서는 문자열도 되고 숫자도 됨
        String message = switch (medalColor2) {
            case "GOLD" -> "금메달 입니다"; // 원래 콜론 자리에 화살표??

            case "SILVER" -> "은메달 입니다";

            case "BRONZE" -> "동메달 입니다";

            default -> {
               if("STONE" == medalColor2){
                   yield "없는 메달입니다";
               }
               else{
                   yield "알수 없음"; // yield 스위치케이스 안에 복잡한 제어문이 더 들어갈때 수행 결과 반환
               }
            }

        }; //끝에 세미콜론   // 그냥 바로 해도 되네? 요래
        System.out.println(message);


    }
}

