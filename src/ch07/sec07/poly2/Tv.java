package ch07.sec07.poly2;

// Tv는 Product를 상속받음
// Tv의 가격은 100만 원.
// Tv 객체의 주소값을 println에 찍으면 "Tv"가 출력 > toString method Override
public class Tv extends Product {
    public Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}