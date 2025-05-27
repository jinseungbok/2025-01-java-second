package ch03.sec07;

public class LogicalOperateExample {
    public static void main(String[] args) {
        int charCode = 'a';
            System.out.println("charCode: " + charCode); // 65

        if( 65 <= charCode && charCode <= 90 ) { // 대문자
            System.out.println("대문자이군요.");
        }
        /*
        true && true || false   >>   true (true || false 시 true 우선 계산)
        */

        int value = 6;

        if( value % 2 == 0 || value % 3 == 0 ) {
            System.out.println("2 또는 3 의 배수이군요.");
        }
    }
}
