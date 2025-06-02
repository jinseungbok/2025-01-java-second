package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
    //  필드 변수명 생성연산자 instance
    // public Car 를 호출
        System.out.println("모델명: " + car.model);
        System.out.println("시동여부: " + car.start);
        System.out.println("현재속도: " + car.speed);
    }
}