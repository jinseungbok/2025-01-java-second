package ch02.sec01.method;

public class VariableUseMethodExampleResult01 {
    public static void main(String[] args) {
        // static과 static은 접근 가능
        printTime(10, 20); // console 10:20
        printTime(2, 9); // console 02:09

        printTime(2, 9, 2); // console 02:09:02
        printTime(12, 9, 22); // console 02:09:02
    }

    // Answer
    public static void printTime(int hour, int min, int sec) {
        //System.out.printf("%02d:%02d\n", hour, min);
        String strHour = hour < 10 ? "0" + hour : String.valueOf(hour);
        System.out.print(strHour + ":");
        printTime(min, sec);
    }

    public static void printTime(int time1, int time2) {
        //System.out.printf("%02d:%02d\n", hour, min);
        String strTime1 = time1 < 10 ? "0" + time1 : String.valueOf(time1);
        String strTime2 = time2 < 10 ? "0" + time1 : String.valueOf(time2);
        System.out.println(strTime1 + ":" + strTime2);
    }
}
/*
    public static void printTime(int hour, int min) {
        System.out.println("printTime: " + hour + ":" + min);
        System.out.println("--------------");
        System.out.println("printTime: " + "0" + hour + ":" + "0" + min);
    }
    public static PrintTime(String hour, String min, String second) {
        String x = Integer.parseInt(hour);
        String y = Integer.parseInt(min);
        String z = Integer.parseInt(second);
        return;
        System.out.println("0"+hour+"0"+hour+"0"+"second");
        */
        /*
    public static printTime(int min, int hour)
        if {
            for(int i=0; i<9; i++)
        }
        return;
        */
//      System.out.printf("%d%s\n"+":"+"%d%s");
