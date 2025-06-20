package Control.legacy;
import Control.GenelecWoofer;
import Control.MartinWoofer;
import Control.Speaker;
import Control.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    // HarmanSpeaker가 객체화된다면 GenelecWoofer를 사용할 수 있도록
    // HarmanSpeaker speaker = new HarmanSpeaker();

    public HarmanSpeaker() {
        this.woofer = new GenelecWoofer();
    }

    @Override
    public void speakerSound() {
        System.out.println("HarmanSpeaker: 소리가 맑아요.");
        woofer.baseSound();
    }
}
