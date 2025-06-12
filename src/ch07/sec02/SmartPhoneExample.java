package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("iPhone16pro", "natural gray");
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        myPhone.bell();
        myPhone.internet();
        myPhone.handUp();
    }
}
