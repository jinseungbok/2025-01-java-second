package ch07.sec02_2;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("iPhone16pro", "natural gray");

        System.out.println("모델: " + myPhone.getModel());
        System.out.println("색상: " + myPhone.getColor());

        myPhone.bell();
        myPhone.internet();
        myPhone.handUp();
    }
}
