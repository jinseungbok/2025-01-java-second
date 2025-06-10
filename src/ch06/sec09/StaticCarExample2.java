package ch06.sec09;

public class StaticCarExample2 {
    public static void main(String[] args) {
        StaticCar car1 = new StaticCar("벤츠");
        car1.setSpeed(100);
        car1.run(); // 벤츠가 달립니다. 시속 100km/h

        StaticCar car2 = new StaticCar("포르쉐");
        car2.setSpeed(200);
        car2.run(); // 포르쉐가 달립니다. 시속 200km/h

        car1.run(); // 포르쉐가 달립니다. 시속 200km/h
        StaticCar.run(); // 포르쉐가 달립니다. 시속 200km/h
    }
}
