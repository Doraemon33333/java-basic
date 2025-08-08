package day11;

public class gskgeioggki {


    private static int serialNum = 10000;
    private int studentID;
    private String name;
    private int[] score;
    private double avg;


    public gskgeioggki(String name, int[] score) {
        serialNum++;
        this.studentID = serialNum;
        this.name = name;
        this.score = score;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int[] getScore() {
        return score;
    }

    public double getAvg() {
        avg = (score[0] + score[1] + score[2]) / 3.0;
        return avg;
    }

    // 성적 결과 출력 메서드
    public void printResult() {

        System.out.printf("학번 : %d%n이름 : %s%n점수 : %d   %d   %d , 평균 : %.2f%n", studentID, name, score[0], score[1], score[2], getAvg());
        System.out.println();
    }

}

