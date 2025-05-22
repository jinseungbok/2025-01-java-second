package ch02.sec01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3, y = 5;
        System.out.printf("x: %d, y: %d\n", x, y);
        // 스와핑으로 처리

        /*
        int temp = 5;
        int temp2 = 3;

        temp = x;
        temp2 = y; */

        // 답 1
        /*
        int tmp = y;
        y = x;
        x = tmp;
        */

        // 답 2
        int tmp = x;
        x= y;
        y = tmp;

        // x: 5, y: 3 이렇게 출력되게 해주세요.
        System.out.printf("x: %d, y: %d\n", x, y);
    }
}