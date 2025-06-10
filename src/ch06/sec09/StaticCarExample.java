package ch06.sec09;

public class StaticCarExample {
    public static void main(String[] args) {
        StaticCar.model = "벤츠";
        StaticCar.setSpeed(200);
        StaticCar.run();

        /* 가능하긴 하나
        StaticCar car1 = new StaticCar("BMW");
        car1.setSpeed(100);
        car1.run();
        StaticCar.run(); // 똑같은 값이 2번 출력
        */
    }
}
