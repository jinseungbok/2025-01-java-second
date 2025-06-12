package ch07.sec02;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone() {
        super("", "");
    }

    public SmartPhone(String model, String color) {
        // super(); 자동으로 생성됨. 부모 객체 생성 다음 자식 객체 생성
        // super(model, color); 로 설정할 수 있음
        super(model, color);
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}

