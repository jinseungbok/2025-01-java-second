package Control.legacy;

import Control.MartinWoofer;
import Control.Speaker;
import Control.Woofer;

public class JBLSpeaker implements Speaker {
    private Woofer woofer;

    public JBLSpeaker() {
        this.woofer = new MartinWoofer();
    }

    @Override
    public void speakerSound() {
        System.out.println("JBLSpeaker: 소리가 깔끔하다");
        this.woofer.baseSound();
    }
}
