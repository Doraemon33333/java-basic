package day4.switchexample;

public class SwitchCase {
    public static void main(String[] args) {
        /*
        * switch(조건) {
        *     case 조건과 일치하는지 확인할 값 1 : 수행문;
        *                                      break;
        *     case 조건과 일치하는지 확인할 값 2 : 수행문;    // case는 여러개 가능
        *                                      break;
        *     default : 수행문;
        * }
        * break? : 케이스에 일치하는 경우 수행문을 시행하고 switch-case 문을 빠져나가게 함
        * default? : 어떤 케이스도 해당하지않으면 수행할 명령임
        * */


        int ranking = 1;
        String medalColor = "GOLD"; // 스위치에서는 문자열도 되고 숫자도 됨
        switch (medalColor) {
            case "GOLD" :
                System.out.println("금메달 입니다");
            break;
            case "SILVER" :
                System.out.println("은메달 입니다");
            break;
            case "BRONZE" :
                System.out.println("동메달 입니다");
            break;

            default:
                System.out.println("노메달 입니다");
        }
        System.out.println(ranking+ "등 메달의 색은 " +medalColor+"입니다");
    }
}
