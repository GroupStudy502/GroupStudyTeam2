package test01;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] num1 = { 20, 30, 15, 99};

        int[] reverseNum1 = new int[4];

        for (int i = num1.length - 1, j = 0; i >= 0; i--, j++) {
            reverseNum1[j] = num1[i];
        }

        System.out.println("정배치 : " + Arrays.toString(num1));
        System.out.println("역배치 : " + Arrays.toString(reverseNum1));
    }
}


