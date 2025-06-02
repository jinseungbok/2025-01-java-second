package ch06.sec04;

public class StudentExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
    //  변수(값을 저장하기 위함, 참조 타입, 주소값 저장 가능, 객체의 주소값)

        s1.name = "홍길동";
        s2.name = "신사임당";

        s1.introduce();
        s2.introduce();
    }
}
