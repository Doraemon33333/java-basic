package day7.array;

public class ArrayTest {
    public static void main(String[] args) {

        // 배열? 같은 자료형을 가진 자료 여러개를 묶어서 관리
        int[] numbers = {1,2,3,4,5,6,7,8};
        int[] nums = {1,2,3};   // 배열 선언과 초기화
        int[] nums2 = new int[3];  // 배열 생성과 값은 default 값으로 초기화

        int[] numsErr;
        // numsErr = {1,2,3}; 이건 안되는 문법
        // numsErr[0] = 1; 안됨
        // int[] numsErr2 = new int[3] {1,2,3};  //안되네

        int[] numsOK;
        numsOK = new int[3]; //배열은 생성될 때 무조건 칸 수 지정해야
        numsOK[0] = 1;
        numsOK[1] = 2;
        numsOK[2] = 3;

        System.out.println(numsOK[0]);
        System.out.println();
        System.out.println(numbers[2]);
        System.out.println();

        for (int i = 0; i < numsOK.length; i++) {
            System.out.println(numsOK[i]);
        }

        int year = 2001;
        String[] animal = {"ㅈ","ㅅ","ㅎㄹㅇ","ㅌㄲ","ㅇ","ㅂ","ㅁ","양","원","닭","개","ㄷㅈ",};
        int result = (year - 1984) % 12; //인덱스에는 음수값이 없다
        System.out.println(animal[result]);

        /*System.out.println("--------------");

        char hiraA[] = {'あ', 'い', 'う', 'え', 'お'};
        char hiraK[] = {'か', 'き', 'く', 'け', 'こ'};

        System.out.println(hiraA);
        System.out.println(hiraK);*/

    }
}
