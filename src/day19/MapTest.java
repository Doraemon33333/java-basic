package day19;

import day17.ArrayStudent;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(); // 앞에가 키임
        map.put("사토", "佐藤");
        map.put("이토", "伊藤");
        map.put("후지모토", "藤本");
        map.put("아오키", "青木");
        map.put("호날두", "ronaldo");

        System.out.println(map.get("이토"));//리무브 : 한번읽으면 증발함
        System.out.println(map);
        map.put("아오키", "aoki");
        System.out.println(map);


        HashMap<String, Object> map2 = new HashMap<>();
        map2.put("개꼴데", 8888577);
        map2.put("롯데자이언츠", "야구 존나 못해");
        map2.put("롯데", new ArrayStudent("최근 순위", 7, 8, 8));
        map2.put("sb", new StringBuffer("abcdefg"));
        //map2.put("아오키", "青木");
        //map2.put("아니 제발 10연패 하지마라", "오늘은 이긴다");
        System.out.println(map2);
    }


    /*
     *                 바이트                                     문자
     * 입력                            출력               입력               출력
     * InputStream                 OutputStream        Reader               Writer
     * FileInputStream
     * BufferedInputStream
     *
     * File, BuffferedReader, BufferedWriter
     *
     *
     * */
}
