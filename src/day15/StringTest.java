package day15;

public class StringTest {
    public static void main(String[] args) {
        String a;
        String b = null;
        String c = "";
        String d = "abc";
        String e = "abc";
        String f = new String("abc");
        String g = new String("abc");

        // System.out.println(a); 초기화 안되어서 에러
        System.out.println(b);
        // System.out.println(b.length()); null 에는 랭스 불가능?
        System.out.println(c);
        System.out.println(c.length());
        System.out.println(d);
        System.out.println(e);
        System.out.println(d == e); // 트루 ( 주소가 같으니까)
        System.out.println(f);
        System.out.println(e == f); // 근데 이새끼들은 주소가 다름 그래서 false임
        System.out.println(g);
        System.out.println(f == g); // 이새끼들도 주소 다름 abc는 같은데
        System.out.println(f.equals(g)); // 문자열 내용 비교
        System.out.println(g.equals("ABC")); //대문자랑은 다르다 푸하하ㅏ
        System.out.println(g.equalsIgnoreCase("ABC")); // 대소문자 노상관
        System.out.println(g.startsWith("a")); //처음꺼 비교
        System.out.println(g.endsWith("c"));// 마지막 글자 비교
        System.out.println("------------------");
        g = "Sakamoto Hayato";
        System.out.println(g.charAt(1));   // 0부터 시작해서 1 2 3 이렇게 갈때 그에 해당하는 그거
        System.out.println(g.indexOf('a'));  //첫번째 a 몇번째 자리인지 , 없는거 찾으려하면 -1 인듯요
        System.out.println(g.lastIndexOf('a')); //마지막 a 몇번째 자리인지
        System.out.println(g.substring(5)); // 5번위치 앞으로는 전부 모가지따기
        System.out.println(g.substring(5, 7)); // 걍 저 사이에 출력인듯 5번위치부터 7번 앞까지
        System.out.println(g.concat("!!!!!!")); // 뒤에 붙이기
        System.out.println(g.toUpperCase()); // 왜 대문자로 바뀌냐
        System.out.println(g); // 그냥 그대로

        String s = g.substring(5); // 지금부터 잘린 문자열 s로 사용하기
        g = g.substring(5);
        g = g + "???";

        String filename = "이력서_홍길동.250814.docx";

        System.out.println("확장자는 " + filename.substring(filename.lastIndexOf('.') + 1));


        //아니 슈발 근데 더 간단한게 있었네
        int pos = filename.lastIndexOf('.');//마지막.의 위치
        if (pos == -1) {
            System.out.println("확장자가 없습니다");
        } else {

            String ext = filename.substring(pos + 1);//마지막 . 위치 바로 뒤부터 마지막까지 문자열
            System.out.println("확장자는 " + ext);
        }

        String phone = "010-1234-5678";
        // '-' 기준으로 나누어 배열에 각각 저장 [010], [1234], [5678]
        // -를 . 으로 바꾸기
        int[] number = new int[3];
        //number[0] = phone.substring()

    }
}
