package ch07.sec07.poly;

public class AnimalExample2 {
    public static void main(String[] args) {
        // 주소값 instanceof 타입
        // 타입이 주소값을 저장할 수 있는지를 물어봄
        // 저장 가능하면 true, 없으면 false

        Tiger tiger = new Tiger();
        System.out.println(tiger instanceof Cat); // True

        Cat cat = tiger;
        System.out.println(cat instanceof Tiger); // True

        Tiger tiger2 = (Tiger)cat;

        System.out.println(tiger2 instanceof Animal); // True

    }
}
