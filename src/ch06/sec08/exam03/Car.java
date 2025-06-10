package ch06.sec08.exam03;
/*
Access Modifier(접근 제어자)

private   - 같은 class 안에서만 접근 가능
default   - private + 같은 package 접근 가능. 아무 것도 적지 않은 상태
protected - default + 상속 관계 접근 가능
public    - 무조건 접근 가능

private 멤버필드에 값 쓰기 방법 2가지
- 생성자
- (setter) method

private 멤버필드에 값 읽기 방법 1가지
- (getter) method

 */
public class Car {
    private int gas; // private 멤버필드
    private int oil;

    // 기본 생성자 추가 (원한다면)
    public Car() {
        this.gas = 0;
        this.oil = 0;
    }

    public Car(int gas, int oil) {
        this.gas = gas;
        this.oil = oil;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
