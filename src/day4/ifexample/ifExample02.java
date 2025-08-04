package day4.ifexample;

public class ifExample02 {
    public static void main(String[] args) {
        /*
        * if(조건식){
        *    조건식이 참을 반환할때 실행할 수행문;
        * }
        * else if (또다른 조건식) {
        *    또다른 조건식이 참일때
        * }
        * else {
        *    위의 조건식이 모두 거짓을 반환할때 실행
        * }
        *
        * */
        String name = "青木さん";
        int age = 13;
        int charge;
        if ( age < 8){
            charge = 1500;
            System.out.println(name + " 미취학 아동입니다");
        }
        else if (age < 14) {            //if로 쓴다면 ( age >= 8 && age < 14) 이런시으로 바꿔주기
            charge = 2000;
            System.out.println(name + " 초등학생입나다");
        }
        else if (age < 20) {
            charge = 2500;
            System.out.println(name + " 중,고등학생입니다");
        }
        else {
            charge = 3000;
            System.out.println(name + " 성인입니다");
        }
        System.out.println("입장료는 "+ charge + "원입니다");

        int a = 9;
        int b = 32;
        int max;
        if(a>b) {
            max = a;
        }
        else {
            max = b;
        }

        max = (a>b) ? a : b;
    }
}
