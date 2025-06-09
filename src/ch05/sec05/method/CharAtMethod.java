/*
package ch05.sec05.method;

import java.util.Scanner;

public class CharAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756");  // "남자"리턴
        String gender2 = checkGender("900212-2998756"); // "여자"리턴


    public static String[] checkGender(String from, String to) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요 (xxxxxx-xxxxxxx)> ");
        String gender = scanner.next();
        if(Checkgender.length() !=14) {
            System.out.println("잘못 입력하셨습니다");
            return;
        }
        char gender = gender.charAt(7);
        switch(gender) {
            case '1', '3' -> System.out.println("남자입니다");
            case '2', '4' -> System.out.println("여자입니다");
            default -> System.out.println("null");
        }

        // 8번째 문자가 '2', '4' > 여자 리턴
        // 8번째 문자가 '1', '3' > 남자 리턴
        // 8번째 문자가 '1', '2', '3', '4'가 아니면 null 리턴
    }
}
*/