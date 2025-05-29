package ch04.sec04;

import java.util.Arrays;

public class ArrayShuffleExample {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 10칸짜리 정수 배열을 만들고 싶다.
        arr[0] = 1;
        for(int i=0; i<arr.length; i++) {
            arr[i] = i + 1;
        }
        // arr[0] = 1;
        // arr[1] = 2;
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------");
        /*
            0~9 랜덤값 구한다. 예를 들어 7이 나왔다. 0번 방과 7번방 스와핑
            0~9 랜덤값 구한다. 예를 들어 8이 나왔다. 1번 방과 8번방 스와핑
            0~9 랜덤값 구한다. 예를 들어 5이 나왔다. 2번 방과 5번방 스와핑
         */
        for(int i=0; i<arr.length; i++) {
            int rIdx = (int)(Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}


/* for (int i = 0; i < arr.length; i++) { */

/*
int arr[] = new int[10];
 */

/*
        int x = (int)(Math.random() * 9) +2;
        arr[i] = 0 + 1;
        int temp = 0;
        0 + 1 = int temp;
 */