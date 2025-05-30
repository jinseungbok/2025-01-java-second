package ch05.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        String[] season = { "Spring", "Summer", "Fall", "Winter" };
              // String 배열 주소값 저장
        System.out.println("season[0]: " + season[0]);
        System.out.println("season[1]: " + season[1]);
        System.out.println("season[2]: " + season[2]);
        System.out.println("season[3]: " + season[3]);

        season[0] = "봄";
        System.out.println("season[0]: " + season[0]);

        int[] scores = { 83, 90, 87 };
        int sum = 0;
        // 향상된 for 문 (읽기 할 때 활용)
        for(int item : scores) {
            sum += item;
        }
        // 총합
        System.out.println("scores: " + sum);
        // 평균
        double avg = (double)sum / scores.length;
        System.out.printf("avg: %.2f\n", avg);
    }
}
        /*
        for(sum i = sum + i; i<4; i++) {
            System.out.println(scores);
        } */