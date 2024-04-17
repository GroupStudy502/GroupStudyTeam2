package exam02;
import java.util.Arrays; // 중간고사!!

public class Practice01 { // 반복문을 사용하여 원본 배열의 원소들을 거꾸로 배열
    public static void main(String[] args) {
        // 원본 배열
        int[] arr = { 1, 2, 3, 4, 5 };

        // 거꾸로 배열
        int[] reverseArr = new int[5];

        // 원본배열(arr)의 마지막 인덱스(int i = arr.length - 1)부터 탐색하여
        // 거꾸로 배열(reverseArr)에 순서대로 값을 세팅한다.
        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr[i];
        }

        // 원본 배열과 거꾸로 배열의 값을 출력한다.
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("reverseArr : " + Arrays.toString(reverseArr));
    }
}

/* 결과
arr : [1, 2, 3, 4, 5]
reverseArr : [5, 4, 3, 2, 1]
 */