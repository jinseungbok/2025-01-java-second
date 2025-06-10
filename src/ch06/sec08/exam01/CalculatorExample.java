package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        // static은 필요에 의해 사용. static 사용안하는 경우가 많음
        // 객체 생성 없이 사용할 수 있음
        // new 다음 생성자 호출(기본 생성자)
        // 추가로 생성된 생성자는 추가 생성자
        // {} 2개 안에 있으면 무조건 지역변수(local parameter)
        Calculator cal = new Calculator();
//    reference변수 변수명 = new연산자 생성자
        int result = cal.plus(1, 2);
        System.out.println("result: " + result);
        System.out.println("result2: " + cal.plus(10, 20));

        for(int i=0; i<20; i++) {
            cal.powerOn();
        }
        // 20번 반복

        cal.powerOn();
        // void method는 항상 혼자 있음 {} () 감쌀 수 없음
    }
}
