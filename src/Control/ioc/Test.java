package Control.ioc;

import Control.Tv;

public class Test {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
//      TvFactory tvFactory1 = new TvFactory(); // 안되도록 변경
//      Tv tv = tvFactory.factory("harman", "genelec");
        Tv tv = tvFactory.factory(args[0], args[1]);
        // Run/Debug configurations 이용해 변경 가능
        tv.sound();
    }
}
