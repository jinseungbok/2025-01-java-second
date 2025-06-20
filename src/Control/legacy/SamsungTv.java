package Control.legacy;

import Control.MartinWoofer;
import Control.Speaker;
import Control.Tv;

public class SamsungTv implements Tv {
    // 삼성Tv는 스피커를 사용할 수 있다.
    // 스피커는 HarmanSpeaker를 사용
    private Speaker speaker;

    public SamsungTv() {
        this.speaker = new HarmanSpeaker();
    }

    @Override
    public void sound() {
        System.out.println("SamsungTv의 소리는요.");
        this.speaker.speakerSound();
        }
    }

