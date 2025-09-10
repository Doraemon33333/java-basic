package day17;

import java.io.Serializable;

//extends Object 생략
// 의무적으로 밑에 뭐시기 만들어야함
public class ArrayStudent implements Comparable<ArrayStudent>, Serializable {
    //맴버변수
    //private static int plus = 0;
    private int num = 0;
    private String name;
    private int kor;
    private int math;
    private int eng;

    //메소드
    public ArrayStudent() {

    }

    public ArrayStudent(String n, int k, int m, int e) {
        //plus++;
        //this.num = plus;
        name = n;
        kor = k;
        math = m;
        eng = e;
    }

    public ArrayStudent(int id, String n, int k, int m, int e) {
        num = id;
        name = n;
        kor = k;
        math = m;
        eng = e;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int number) {
        this.num = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getTotal() {
        return kor + math + eng;
    }

    @Override
    public int compareTo(ArrayStudent o) {
        return this.getTotal() - o.getTotal();
    }

    @Override
    public String toString() {
        return "(" + "학번 " + num + " : " + name + ", " + kor + ", " + math + ", " + eng + ", " + String.format("%.2f", getTotal() / 3.0) + ")";
    } //사이에 throws?
}
