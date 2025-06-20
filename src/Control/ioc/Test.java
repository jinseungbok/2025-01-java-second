package Control.ioc;

import Control.Tv;

public class Test {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
//      TvFactory tvFactory1 = new TvFactory(); // 안되도록 변경
        Tv tv = tvFactory.factory("harman", "genelec");
        tv.sound();
    }
}
