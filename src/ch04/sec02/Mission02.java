package ch04.sec02;

import java.util.Scanner;

public class Mission02 {
    /*
    (점수를 입력받는다.)
    점수를 입력해 주세요. >> 99 (점수 입력 후 엔터)
    (100 초과 혹은 0 미만이면) "잘못된 점수입니다."
    (90점 이상) "A 등급"



     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 > ");
        int grade = scanner.nextInt();
        if (grade > 100 || grade < 0) {
            System.out.print("잘못된 점수입니다.");
        }
        switch (grade / 10) {
            case 10, 9 :
                System.out.println("A");
                break;
            case 8 :
                System.out.println("B");
                break;
            case 7 :
                System.out.println("C");
                break;
            case 6 :
                System.out.println("D");
                break;
            case 5, 4, 3, 2, 1, 0 :
                System.out.println("F");
                break;
            default :
                System.out.println("잘못된 점수입니다.");
                break;
        }
    }
}
