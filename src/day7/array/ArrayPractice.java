package day7.array;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] score = {55, 60, 71, 84, 62};
        char[] grades = new char[5];

        for (int i = 0; i < score.length; i++) {
            grades[i] = whatGrade(score[i]);
        }
        for (int i = 0; i < grades.length; i++) {
            char g = grades[i];
            System.out.print(g + " ");
        }

        System.out.println(" ");
        System.out.println("--------------------");

        System.out.println(score);
        System.out.println(grades);

    }

    /**
     * 점수를 받아 등급을 출력해주는 메서드 whatGrade()
     *
     * @param score
     * @return 문자형 grade 결과값
     */
    public static char whatGrade(int score) {

        if (score > 100) {
            return '?';
        } else if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else if (score >= 0) {
            return 'F';
        } else {
            return '?';
        }

    }
}
