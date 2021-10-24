package ru.gb;

public class HomeWork03 {
    public static void main(String[] args) {
        // homeWorkH1();
        // homeWorkH2();
        // homeWorkH3();
//        homeWorkH4();
//        homeWorkH5(8, 10);
        //homeWorkH6();
        int[] a = {1, 2, 3, 4, 6};
        System.out.print(homeWorkH7(a));
    }

    public static void homeWorkH1() {
        int[] a = {1, 0, 0, 1, 0, 1, 1, 0};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
                a[i] = 0;
            }
        }
        System.out.print("a[i] = ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void homeWorkH2() {
        int[] a = new int[100];
        for (int i = 0; i < 100; i++) {
            a[i] = i + 1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void homeWorkH3() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] = a[i] * 2;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void homeWorkH4() {
        int[][] a = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == j) || (i == 4 - (j + 1))) {
                    a[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] homeWorkH5(int len, int initialValue) {
        int a[] = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = initialValue;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        return a;
    }

    public static void homeWorkH6() {
        int[] a = {-1, 5, 3, 2, -11, 4, 5, 2, -4, 8, 9, 1};
        int min = a[0], max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("max= " + max + " min= " + min);
    }

    public static boolean homeWorkH7(int[] a) {


        int lefts = 0;
        int rights = 0;
        for (int i = 1; i < a.length - 1; i++) {
            for (int l = 0; l < i; l++) {
                lefts = lefts + a[l];
            }
            for (int r = i + 1; r < a.length; r++) {
                rights = rights + a[r];
            }
            if (lefts == rights) {
                System.out.println(a[i]);
                return true;
            }
            lefts = 0;
            rights = 0;
        }
        return false;
    }
}
