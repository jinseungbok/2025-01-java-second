package ch06.sec08.exam02;
class Computer {
    // 가변 인자 사용
    int sum(int... values) {
        // 가변길이 매개변수. 잘 사용하지는 않는 편
        int sum = 0;
        for (int val : values) {
            sum += val;
        }
        return sum;
    }
}

// 배열을 인자로 받는 메서드 (선택 사항: 위의 메서드 하나로도 처리 가능)
/* int sum(int[] values) {
    int total = 0;
    for (int val : values) {
        total += val;
    }
    return total;
}
*/