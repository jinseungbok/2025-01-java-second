package ch05.sec03;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1, arr2, arr3;

        arr1 = new int[] { 1, 2, 3 };
        arr2 = new int[] { 1, 2, 3 };
        arr3 = arr2;
        System.out.println(arr1 == arr2); // false
        System.out.println(arr3 == arr1); // false
        System.out.println(arr3 == arr2); // true
        // arr3 과 arr2는 같은 주소를 공유하므로 true. >> 주소값 복사(얕은 복사, shallow copy)
    }
}
