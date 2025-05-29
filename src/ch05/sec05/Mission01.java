package ch05.sec05;

import java.util.Scanner;

public class Mission01 {
    /* 주민번호를 입력하시오 (xxxxxx-xxxxxxx) >
    (만약) 주민등록번호 길이가 다르면 "잘못 입력하셨습니다"
    (길이가 맞다면) 8번째 자리 값으로 "여성", "남성" 출력해 주세요.
    (8번째 자리가 1~4가 아니라면) "잘못 입력하셨습니다"
    */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("주민번호를 입력하시오 (xxxxxx-xxxxxxx)> ");
        String ssn = scanner.next();
        if(ssn.length() != 14) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        char gender = ssn.charAt(7);
        switch(gender) {
            case '1', '3' -> System.out.println("남자");
            case '2', '4' -> System.out.println("남자");
            default -> System.out.println("잘못 입력하셨습니다");
        }
    }
}
        /*
        String gender = scanner.next();
        String charAt(7) =
        if(String charAt(7) > 1) {
            switch(gender) {
            case '1', '3' ->
                System.out.println("남자");
                break;
            case '2', '4' ->
                System.out.println("여자");
                break;
            default ->
                System.out.println("잘못 입력하셨습니다.");
                break;
        } */