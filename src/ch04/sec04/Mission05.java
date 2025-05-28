package ch04.sec04;

public class Mission05 {
    public static void main(String[] args) {
        int[] arr = { 10, 70, 90, 110 };
        // 배열의 모든 값을 더한 결과값을 출력하시오.
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum: " + sum);
    }
}
        /*
        System.out.println("arr[0] : " + arr[0]);
        System.out.println("arr[1] : " + arr[1]);
        System.out.println("arr[2] : " + arr[2]);
        System.out.println("arr[3] : " + arr[3]);
        int sum = 0;
        for(int i=0; i<4; i++) {
            sum = arr[i];
        }
        System.out.println("총합 : " + sum); */