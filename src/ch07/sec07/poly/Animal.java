package ch07.sec07.poly;

public abstract class Animal {

    private int age;



    // abstract - 추상 메소드
    // 추상 메소드를 단 하나라도 가지고 있다면 그 클래스는
    // 추상 클래스가 되어야 한다.
    public abstract void crying();
}
    // 구현부가 없어야 한다.
    // 객체화가 안되게 막는다.

