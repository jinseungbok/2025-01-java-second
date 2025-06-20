package Control.legacy;

import Control.Speaker;
import Control.Tv;

public class Test {
    public static void main(String[] args) {
        Speaker speaker = new HarmanSpeaker();
        speaker.speakerSound();

        Speaker speaker2 = new JBLSpeaker();
        speaker2.speakerSound();

        System.out.println("=======");
        Tv tv = new SamsungTv();
        tv.sound();
    }
}
