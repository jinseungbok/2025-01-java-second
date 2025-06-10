package ch06.sec11;

public class FinalObject {
    private final String NAME = "홍길동";
    // 상수 memberfield는 반드시 초기화 해야 함

    // 그러나 !! 생성자로 값을 넣는다는 내용이 있을 경우 선언만 가능하다.
    private final int AGE;

    public FinalObject(final int age) {
        this.AGE = age;
    }
    public void myAge() {
        System.out.println("age: " + this.AGE);
    }
}
