package ch02.sec02;

public class FloatDoubleExample {
    public static void main(String[] args) {
        // 정밀도 확인
        // 실수 리터럴 float 변수에 대입할 때 항상 끝에 'f', Or 'F'를 붙인다.
        float var0 = 0.1F;
        float var00 = (float)0.1;
        float var1 = 0.1234567890123456789F;
        double var2 = 0.123456789012345674;
        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
    }
}