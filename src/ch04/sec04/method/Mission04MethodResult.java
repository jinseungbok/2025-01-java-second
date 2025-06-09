package ch04.sec04.method;

public class Mission04MethodResult {
    public static void main(String[] args) {
        //  int dan = ?; // 2~12 랜덤값
        //  구구단 출력
        /*
        4 x 1 = 4
        4 x 2 = 8
        ...
        4 x 9 = 36
         */
        System.out.println("=============");
        gugudan(4, 9); // 4~9단까지 구구단 출력
        gugudan(2, 4); // 2~4단까지 구구단 출력
    }

    public static void gugudan(int dan) {
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan * i);
        }
    }

    public static void gugudan(int from, int to) {
        for (int dan = from; dan <= to; dan++) {
            System.out.printf("==== %d단 ====\n", dan);
            gugudan(dan);
        }
    }
}

        /*
        public void gugudan(int dan) {
        for (int i=1; i<10; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, dan, i);
        }
        gugudan(4, 9);
        gugudan(2, 4);
        */