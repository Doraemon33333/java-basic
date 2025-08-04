package day6;

public class StarPractice {
    public static void main(String[] args) {
        //*****
        //*****
        //*****
        //*****
        //*****

        //*
        //**
        //***
        //****
        //*****

        //*****
        //****
        //***
        //**
        //*

        //    *
        //   ***
        //  *****
        // *******
        //*********

        int i = 1;
        for (; i <= 5; i++) {
            int j = 1;
            for (; j <= 5; j++) {
                System.out.print("(" + i + "," + j + ")");  // 좌표찍기
            }
            System.out.println();

        }
        System.out.println("----------");

        int k = 1;
        for (; k <= 5; k++) {

            int l = 1;
            for (; l <= k; l++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("----------");

        int m = 1;
        for (; m <= 5; m++) {

            int n = 5;
            for (; n >= m; n--) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("----------");

        int a = 1;
        for (; a <= 5; a++) {
            int b = 1;
            int c = 1;

            for (; c <= 5 - a; c++) {
                System.out.print(" ");
            }

            for (; b <= 2 * a - 1; b++) {
                System.out.print("*");
            }

            System.out.println();


        }

    }
}
