package ch07.sec02;

public class Phone {
    public String model;
    public String color;

    public Phone(String color, String model) {
        super();
        this.color = color;
        this.model = model;
    }

    public void bell() {
        System.out.println("벨이 울립니다.");
    }
    public void sendSms(String message) {
        System.out.println("본인: " + message);
    }
    public void receiveSms(String message) {
        System.out.println("상대방: " + message);
    }
    public void handUp() {
        System.out.println("전화를 끊습니다.");
    }
}
