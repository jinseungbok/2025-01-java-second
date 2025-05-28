package ch04.sec04;

public class Mission03 {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 6.0) + 3; // 3~8 랜덤값 생성
        System.out.println("star: " + star);

        for(int z=0; z<star; z++) {
            for (int i = 0; i < star; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
        /*
        System.out.printf("star: %d\n" + star);
            for (int i=0; i<= star; i++) {
        System.out.print("*");
        }
        // ******
        */

