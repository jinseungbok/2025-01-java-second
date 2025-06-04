package ch06.sec08;

public class Calculator {
    // void method
    public void powerOn() {
        System.out.println("전원을 켭니다.");
    }
    public void powerOff() {
        System.out.println("전원을 끕니다");
    }

    // return method
    public int plus(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
}
