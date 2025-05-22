package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int min = 5;

        // hour, min 변수를 활용하여 아래처럼 출력해 주세요.

        System.out.println((hour) + "시간 " + (min) + "분");
        System.out.println("총 " + (hour * 60 + min) + "분");

        // 3시간 5분
        System.out.printf("%d시간 %d분\n", hour, min);

        // 총 185분
        System.out.printf("총 %d분", hour * 60 + min);
    }
}
