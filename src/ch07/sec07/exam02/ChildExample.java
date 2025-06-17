package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        child.method1();
        child.method2();
        child.method3();

        System.out.println("----------------");
        Parent parent = child;
        // 타입은 알고 있는 메소드만 호출할 수 있다.
        parent.method1();
        parent.method2();
//      parent.method3(); 호출할 수 없음
        // method3() 메소드를 호출하고 싶다. 어떻게 할 것인가?
        // method3() 메소드를 알고 있는 타입으로 형변환 해주면 된다.
        Child child2 = (Child)parent;
        child2.method3();

    }
}
