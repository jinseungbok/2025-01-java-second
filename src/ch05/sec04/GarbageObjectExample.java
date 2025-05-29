package ch05.sec04;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행"; // String 객체 주소값이 hobby 변수에 대입
        hobby = null; // 여행 문자열을 가지고 있는 String 객체는 유기됨

        String kind1 = "자동차";
        String kind2 = kind1;
        kind1 = null; // kind2가 자동차로 이미 주소값이 복사됨
        System.out.println("kind2: " + kind2);
    }
}
