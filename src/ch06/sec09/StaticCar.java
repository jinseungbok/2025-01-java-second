package ch06.sec09;

public class StaticCar {
    public static String model;
    public static int speed;
    // static이 붙지 않은 method = instance memberfield

    public StaticCar(String m) {
        model = m;
    }
    // 생성자 앞에서는 static 붙일 수 없음
    // speed 멤버필드 setter 메소드
    public static void setSpeed(int s) {
        speed = s;
    }
    public static void run() {
        System.out.printf("%s가 달립니다. 시속 %dkm/h\n", model, speed);
    }
}
