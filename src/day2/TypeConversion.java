package day2;

public class TypeConversion {
    public static void main(String[] args) {
        // 묵시적 형변환 Implicit Conversion
        // 바이트 크기 작은 자료형에서 큰 자료형으로 자동(묵시적 으로 이루어 짐), (차지하는 메모리 기준)
        // 정밀하지 않은 자료형에서 더 정밀한 자료형으로 자동으로 이루어짐, ( 정수보다는 실수가 정밀한 부분임)

        byte bNum = 10;
        int iNum = bNum; // ?    --> 이거는 ㄱㅊ byte에서 int로 갔기 때문

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;  // 정밀한거 : 정수형
        float fNum = iNum2;   // 더 정밀한거 : 실수형

        System.out.println(iNum2);
        System.out.println(fNum);  // -> 실수형으로 바꼇기 때문에

        double dNum;
        dNum = fNum + iNum;
        System.out.println(dNum);

        // 명시적 형 변환 Explicit Conversion
        // 묵시적 형 변환과 반대의 경우
        // 형 변환시 데이터의 손실이 발생할수 있다
        // int explicitConvINum
        int num1 = 1000;
        byte num2 = (byte)num1; // 그냥 하면 안됨
        System.out.println(num2); // 큰 -> 작은 으로 대입해서 데이터 손실이 발생함

        double dNumPI = 3.94;
        int iNum1 = (int)dNumPI; // 실수형을 정수형에 넣어보기
        System.out.println(iNum1); // 소수점 잘림( 3.14든 3.94든 3으로 나옴 = 버림)


        double dNum1 = 1.2;
        float fNum2 = 0.9f;

        int inum3 = (int)dNum1 + (int)fNum2; // 위에 두개 int에는  안들어감, (int)있어야함
        int inum4 = (int)(dNum1 + fNum2);
        System.out.println(inum3);
        System.out.println(inum4);  // 소수점 먼저 떼고 계산 한거랑 2.1에서 0.1을 떼서 2가 된거랑 다름
        // 형변환과 계산의 순서에 의해 결과값이 다를수 있다



    }
}
