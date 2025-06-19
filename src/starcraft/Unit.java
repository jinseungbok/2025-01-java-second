package starcraft;

public abstract class Unit {
    protected int x; // 좌표 x
    protected int y; // 좌표 y
    // abstract를 넣으면 객체화 x, 객체화 막기 위해 abstract 넣기도 함
    // protected = 상속 관계에서 접근을 시켜주는 것

    // 이동
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void stop() {
        System.out.println("현재 위치에 정지한다.");
    }
}