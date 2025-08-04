package day4.switchexample;

public class SwitchCase03 {
    public static void main(String[] args) {
        // 1,3,5,7,8,10,12 월은 -> 31일까지

        int month = 1;
        int day = switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> {
                // 1~12월 이외의 숫자를 입력한경우
                if(month < 1 || month > 12){
                    System.out.println("없는 달 입니다");
                }
                // 그마저도 아닌경우
                else{
                    System.out.println("???????");
                }
                yield 0;   // yield 가 위에 day로 들어가게됨 그때 int니까 0으로 써준듯,
                // case 안에서 여러 문장을 실행한 뒤 값을 반환해야 할 때

            }
        };
        System.out.println(month+"월의 날짜는 "+ day + "일 까지 있습니다");

    }
}
