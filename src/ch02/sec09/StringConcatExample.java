package ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {
        // 숫자 연산
        int result1 = 10 + 2 + 8;
        System.out.println("result1: " + result1); // 20

        // 결합 연산
        String result2 = 10 + 2 + "8";
        System.out.println("result2: " + result2); // 128
        // 10 + 2 = 12 (int)
        // 8 (string)
        // 12(int) + 8(String) = 128 concat
        // 정수가 인트로 변한 것은 형변환이 아닌 parsing 이라 함.

        String result3 = 10 + "2" + 8;
        System.out.println("result3: " + result3); // 1028

        String result4 = "10" + 2 + 8; // 처음부터 문자열, 뒤도 모두 문자열
        System.out.println("result4: " + result4); // 1028

        String result5 = "10" + (2 + 8); // 괄호는 우선 순위로 계산, 1010
        System.out.println("result5: " + result5);
    }
}
