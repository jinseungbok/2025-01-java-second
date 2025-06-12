package ch07.sec02_2;

public class SmartPhone extends Phone {
    public boolean wifi;

    public SmartPhone(String model, String color) {
        //  super(model, color); 주석시 super(); 자동 생성
        super(model, color); // 무조건 부모가 최상위. super는 생성자 최상위
        System.out.println("SmartPhone 생성자 호출!!");
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
    public void bell() {
        System.out.println("스마트폰이 울린다!!");
        // 부모가 가진 메소드를 자식이 새롭게 정의하는 것을 overriding이라 함
        // 반드시 똑같아야 함
    }
}