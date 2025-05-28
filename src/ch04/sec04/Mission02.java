package ch04.sec04;

public class Mission02 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        // for 문 활용하여 위 처럼 출력되게 해주세요.
        System.out.print(1);
        for(int i=2; i<11; i++) {
            System.out.printf(", %d", i);
        }
        System.out.println();

        System.out.println("-----------");
        for(int i=1; i<11; i++) {
            if(i > 1) {
                System.out.print(", ");
            }
            System.out.print(i);
        }
        /*
        int i = 0;
        for (i = 1; i < 11; i++)
        System.out.print(i + ", "); */ // 1, 2, 3, 4, ... 10, */
    }
}
