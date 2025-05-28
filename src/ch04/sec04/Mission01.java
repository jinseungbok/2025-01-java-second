package ch04.sec04;

public class Mission01 {
    public static void main(String[] args) {
        // 20~30까지 모두 더한 결과값을 출력해주세요.
        // for 문 사용
        int sum = 0;
        /*
        sum = sum + 20;
        sum = sum + 21;
        // ...
        sum = sum + 30; */
        for(int i = 20; i<31; i++) {
            sum = sum + i;
        }
        System.out.println("sum: " + sum);
    }
}
        /*
        int sum = 0;
        int i;
        for (i=20; i<=30; i++) {
            sum += i;
        }
        System.out.println("20~" + (i-1) + " 합: " + sum);
        */
