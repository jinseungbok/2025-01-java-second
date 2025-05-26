package ch03.sec01;

import java.sql.SQLOutput;

public class IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        x++; // + 1
        ++x; // + 1
        System.out.println("x=" + x); // 12
        System.out.println("---------------");

        y--; // - 1
        --y; // - 1
        // ++ --는 앞이나 뒤나 둘다 똑같이 연산된다.
        System.out.println("y=" + y);
        System.out.println("---------------");

        z = x++;
        System.out.println("z=" + z); // 12
        System.out.println("x=" + x); // 13
        System.out.println("---------------");

        z = ++x;
        System.out.println("2. z=" + z); // 14
        System.out.println("2. x=" + x); // 14
        System.out.println("---------------");
        // x = 14, y = 8
        z = ++x + y++;
        System.out.println("3. z=" + z); // 23 y는 올라가기 전 값인 8을 기준으로 + 15
        System.out.println("3. x=" + x); // 15
        System.out.println("3. y=" + y); // 9
    }
}
