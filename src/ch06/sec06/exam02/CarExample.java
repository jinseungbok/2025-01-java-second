package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car mycar = new Car();
    //  mycar.company = "기아"; 생성되지 않은 시점이면 변경 가능
        System.out.println("제작회사: " + mycar.company);
        System.out.println("모델명: " + mycar.model);
        System.out.println("최고속도: " + mycar.maxSpeed);
    //  mycar.speed = 20;
        System.out.println("현재속도: " + mycar.speed);
    }
}
