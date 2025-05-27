package ch03;

public class Confirmation04 {
    public static void main(String[] args) {
        int value = 356;

        // 1. 3.56
        // 2. 3.56 > 3
        // 3. 3 * 100
        System.out.println((int)(value * 0.01) * 100); // 가장 느림

        // 1. 3 (나누기)
        // 2. 3 * 100
        System.out.println(value / 100 * 100); // 정수 / 정수 = 3 * 100 = 300;

        // 1. 56 구함 mod
        // 2. 356 - 56
        System.out.println(value - value % 100); // 300;
    }
}
