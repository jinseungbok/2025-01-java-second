package ch05.sec11;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        System.out.println(args.length);
        System.out.println("---------");
        // 향상된 for문
        for(String item : args) {
            System.out.println(item);
        }
    }
}
