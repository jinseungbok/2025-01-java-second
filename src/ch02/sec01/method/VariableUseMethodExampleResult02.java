package ch02.sec01.method;

public class VariableUseMethodExampleResult02 {
    public static void main(String[] args) {
        // static과 static은 접근 가능
        printTime(10, 20); // console 10:20
        printTime(2, 9); // console 02:09

        printTime(2, 9, 2); // console 02:09:02
        printTime(12, 9, 22); // console 02:09:02
    }

    // Answer
    public static String parseTime(int val) {
        return val < 10 ? "0" + val : String.valueOf(val);
    }
    public static void printTime(int hour, int min, int sec) {
        //System.out.printf("%02d:%02d\n", hour, min);
        System.out.print(parseTime(hour) + ":");
        printTime(min, sec);
    }

    public static void printTime(int time1, int time2) {
        //System.out.printf("%02d:%02d\n", hour, min);
        String strTime1 = parseTime(time1);
        String strTime2 = parseTime(time2);
        System.out.println(strTime1 + ":" + strTime2);
    }
}