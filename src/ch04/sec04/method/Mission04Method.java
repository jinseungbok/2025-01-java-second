package ch04.sec04.method;

public class Mission04Method {
    public static void main(String[] args) {
    //  int dan = ?; // 2~12 랜덤값
    //  구구단 출력

        int gugudan = (int)(Math.random() * 10.0) + 2;
        System.out.println("gugudan: " + gugudan);
        for(int i = 1; i<13; i++) {
            System.out.printf("%d x %d = %d\n", gugudan, i, gugudan * i);
        }
        /*
        System.out.println(gugudan + "x" + gugudan = gugudan * gugudan); */

        /*
        gugudan(int)(Math.random(6+2)) + 2;
        System.out.println(int + "x" + int = int); */
        /*
        4 x 1 = 4
        4 x 2 = 8
        ...
        4 x 9 = 36
         */
    }
}
