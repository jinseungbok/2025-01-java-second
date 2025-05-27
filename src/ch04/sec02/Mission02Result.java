package ch04.sec02;

import java.util.Scanner;

public class Mission02Result {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해 주세요 > ");
        int grade = scanner.nextInt();
        if (grade > 100 || grade < 10) {
            System.out.println("잘못된 점수입니다.");
        } else if (grade >= 90) {
            System.out.println("A");
        } else if (grade >= 80) {
            System.out.println("B");
        } else if (grade >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}