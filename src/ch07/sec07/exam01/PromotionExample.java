package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;  // 부모타입은 자식 객체 주소값 담을 수 있음 > 다형성

        A a2 = e;  // 주소값 담을 수 있음(부모객체이므로)

    //  E e2 = a2; // 주소값 담을 수 있음 (E)a2; 강제 형변환
    //  D d2 = e; 주소값 담을 수 없음 A>B>D A>C>E
    //  D d3 = b; // 안됨 D d3 = (D)b; 안됨
    //  자식 타입은 부모의 객체 주소값을 담을 수 없음
    }
}

class A { }
class B extends A { }
class C extends A { }

class D extends B { }
class E extends C { }
