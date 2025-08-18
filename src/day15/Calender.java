package day15;

import java.util.Calendar;

public class Calender {
    public static void main(String[] args) {
        Calendar c = null; // 사실 널 안써도됨 근데 나중에 또 변수를 쓰기 위해 널로 초기화가 필요함

        for (int i = 0; i < 10; i++) {
            c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int date = c.get(Calendar.DATE);
            int hour = c.get(Calendar.HOUR);
            int minute = c.get(Calendar.MINUTE);
            int second = c.get(Calendar.SECOND);


            System.out.printf("%d年 %d月 %d日 %d時 %d分 %d秒 %n", year, month + 1, date, hour, minute, second);
            try {
                Thread.sleep(1000); // 딜레이
            } catch (InterruptedException e) {
                System.out.println();
            }


        }

    }
}
