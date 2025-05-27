package ch03.sec04;

public class AccuracyExample01 {
    public static void main(String[] args) {
        int apple = 1;
        double pieceUnit = 0.1;
        int number = 7; // 1.0 - 0.7 = 2.9999999999999999 (정밀도가 떨어지는 대신 더 넓은 값)

        double result = apple - number * pieceUnit;
        System.out.println("사과 1개에서 남은 양: " + result);
    }
}
