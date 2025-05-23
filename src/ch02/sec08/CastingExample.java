package ch02.sec08;

public class CastingExample {
    public static void main(String[] args) {
        int var1 = 10;
        byte var2 = (byte)var1;
        // 더 큰 그릇에서 더 작은 그릇으로 옮겨지지 않는다. 자동형변환 X
        // 강제 형변환 하는 것을 casting 이라 함.
        System.out.println("var2: " + var2);

        double var7 = 3.14;
        int var8 = (int)var7;
        System.out.println("var8: " + var8); // 3
        // 정수 타입은 실수를 저장할 수 없으므로 .14가 날아가고 답은 3
    }
}
