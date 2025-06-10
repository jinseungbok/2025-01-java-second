package ch06.sec10;

public class SamsungTv {
    public static String brand;
    public String model;
    public int inch;

    public void printValues() {
        System.out.printf("%s, %s, %d\n", brand, model, inch);
    }
    public static void staticMethod() {
    //  System.out.printf("%s, %s, %d\n", brand, model, inch);
        // model, inch는 객체 생성이 되지 않았으므로 사용되지 않음
    }
    // static method = static memberfield, parameter만 사용하는 경우에만
    public static void staticMethod(int n1, int n2) {
        System.out.printf("%s, %d, %d\n", brand, n1, n2);
    }

}
