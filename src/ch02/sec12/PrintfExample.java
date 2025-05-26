package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 12300;
        System.out.println("상품의 가격:" + value + "원");
        System.out.printf("상품의 가격:%d원\n", value);
        System.out.printf("상품의 가격:%,d원\n", value);

        String result = String.format("상품의 가격:%,d원\n", value);
        System.out.println(result);

        System.out.printf("상품의 가격:%9d원\n", value); // % + 숫자(칸) + d원
        System.out.printf("상품의 가격:%-19d원\n", value);
        System.out.printf("상품의 가격:%011d원\n", value);

        int year = 2025;
        int mon = 9;
        int day = 4;
        // 2025-09-04
        // 2025-10-14
    //  System.out.printf("%yeard" + "-" + "%mond" + "-" + "%dayd");
        System.out.printf("%d-%02d-%02d\n", 2024, 9, 4);
        System.out.printf("%d-%02d-%02d\n", 2024, 10, 4);

        int radius = 10;
        double area = 3.14159 * radius * 10; // 반지름 10의 원의 넓이
        System.out.printf("반지름이 %d인 넓이:%f입니다.\n", radius, area);
        System.out.printf("반지름이 %d인 넓이:%10.2f입니다.\n", radius, area);
        System.out.printf("반지름이 %d인 넓이:%010.2f입니다.\n", radius, area);
        // 날짜처럼 두 자리 또는 세 자리가 나와야 하는 경우에만 사용
        System.out.printf("반지름이 %d인 넓이:%-10.2f입니다.\n", radius, area);

        String name = "홍길동";
        String job = "도적";
        System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
    //  음수값(-)은 좌측 정렬
    }
}

