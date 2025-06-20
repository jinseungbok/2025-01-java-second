package ch08.sec11.exam02;

public class Car implements Vehicle {
    @Override
    public void run() {
    }

    public void stop() {
        System.out.println("자동차가 멈춘다.");
    }
}
