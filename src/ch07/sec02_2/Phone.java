package ch07.sec02_2;

public class Phone {
    private String model;
    private String color;

    public Phone(String model, String color) {
    //  super(); 자동 생성
        System.out.println("Phone 생성자 호출!!!");
        this.color = color;
        this.model = model;
    }

    // model getter
    public String getModel() {
        return this.model;
    }
    // color getter
    public String getColor() {
        return this.color;
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
