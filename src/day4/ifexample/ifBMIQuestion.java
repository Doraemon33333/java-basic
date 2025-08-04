package day4.ifexample;
import java.util.Scanner;
public class ifBMIQuestion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //문제 1

        while(true){
            System.out.print("체중을 입력하세요(kg) : ");
            float weight = input.nextFloat();

            System.out.print("신장을 입력하세요(cm) : ");
            float height = input.nextFloat();

            double BMI = weight / ((height/100)*(height/100));

            String your_weight;

            if(weight == 0 || height == 0){
                break;
            }

            if(BMI < 18.5){
                your_weight = "저체중";           // -> 한줄이면 중괄호 굳이 없어도 됨
            }
            else if(BMI < 23){
                your_weight = "정상";
            }
            else if(BMI < 25){
                your_weight = "과체중";
            }
            else{
                your_weight = "비만";
            }

            System.out.printf("당신의 BMI는 %.2f이며, '%s'입니다.", BMI, your_weight);
            System.out.println();
            System.out.println();

        }

    }
}
