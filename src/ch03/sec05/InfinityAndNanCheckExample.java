package ch03.sec05;

public class InfinityAndNanCheckExample {
    public static void main(String[] args) {
        int x = 5;
        double y = 0.0;
        double z = x / y;
            System.out.println("z: " + z);
            System.out.println("z: " + ( 5 / 0.0 ));
        //  System.out.println("z: " + ( 5 / 0 ));

        System.out.println(z + 2);
        // if문 타입은 boolean 만
        // || 연산자는 둘 중 하나 true면 true로 인정
        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z+ 2);
        }
    }
}
