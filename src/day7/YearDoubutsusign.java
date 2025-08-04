package day7;
import java.util.Scanner;
public class YearDoubutsusign {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int years = input.nextInt();

        switch ((years - 1984) % 12){
            case 0 :
                System.out.println(years +"년은 쥐띠입니다");
                break;
            case 1 :
                System.out.println(years +"년은 소띠입니다");
                break;
            case 2 :
                System.out.println(years +"년은 호랑이띠입니다");
                break;
            case 3 :
                System.out.println(years +"년은 토끼띠입니다");
                break;
            case 4 :
                System.out.println(years +"년은 용띠입니다");
                break;
            case 5 :
                System.out.println(years +"년은 뱀띠입니다");
                break;
            case 6 :
                System.out.println(years +"년은 말띠입니다");
                break;
            case 7 :
                System.out.println(years +"년은 양띠입니다");
                break;
            case 8 :
                System.out.println(years +"년은 원숭이띠입니다");
                break;
            case 9 :
                System.out.println(years +"년은 닭띠입니다");
                break;
            case 10 :
                System.out.println(years +"년은 개띠입니다");
                break;
            case 11 :
                System.out.println(years +"년은 돼지띠입니다");
                break;
        }
    }
}
