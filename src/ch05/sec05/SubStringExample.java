package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMN";
        String str2 = str.substring(8);
        System.out.println(str);
        System.out.println(str2); // IJKLMN, 앞의 8글자를 잘라냄

        System.out.println("------");
        String str3 = str.substring(11);
        System.out.println(str3); // LMN

        System.out.println("------");
        String str4 = str.substring(0, 6);
        System.out.println(str4); // ABCDEF

        System.out.println("------");
        String str5 = str.substring(2, 7);
        System.out.println(str5); // CDEFG
    }
}
