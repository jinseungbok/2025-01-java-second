package ch07.sec07.poly2;

// Computer는 Product를 상속받음
// Computer의 가격은 200만 원.
// Computer 객체의 주소값을 println에 찍으면 "Computer"가 출력 > toString method Override
public class Computer extends Product {
    public Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}
