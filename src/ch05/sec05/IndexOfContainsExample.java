package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int idx = subject.indexOf("프로그래밍");
        System.out.println("idx: " + idx);

        System.out.println(subject.indexOf("그"));
        System.out.println(subject.lastIndexOf("그"));
        // lastIndexOf 는 우측에서부터 찾음
        // 앞의 index 값이 나옴

        // 해당 문자열에 내가 찾는 문자열이 있는가??? contain method 사용
        boolean result = subject.contains("프로그래밍");
        System.out.println("result: " + result);
    }
}
