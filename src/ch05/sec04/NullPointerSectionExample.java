package ch05.sec04;

public class NullPointerSectionExample {
    public static void main(String[] args) {
        int[] arr = null;
    //  arr[0] = 10;
    //  System.out.println(arr.length);
        String str = null;
        System.out.println(str.length());
        // null 값을 이미 주었으므로 그 뒤의 값은 null
    }
}
