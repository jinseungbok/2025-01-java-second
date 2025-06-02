package ch06.sec07.exam01;

public class Car {
    String model;
    boolean start;
    int speed;

    // 오버로딩 (Overloading) 동일한 이름의 method 여러 개 생성 가능
    // parameter의 타입 순서와 갯수가 달라야 함 (parameter name 상관 없음)
    //public Car(boolean bbb, int ccc, String aaa) {}


    public Car(String model, boolean start, int speed) {
        this.model = model;
        this.start = start;
        this.speed = speed;
    }
}
