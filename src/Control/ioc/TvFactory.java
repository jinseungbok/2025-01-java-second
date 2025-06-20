package Control.ioc;
import Control.*;
public class TvFactory {
    // 싱글톤으로 제작
    private static TvFactory tvFactory = null;

    public static TvFactory getInstance() {
        if(tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }
    private TvFactory() {}

    public Tv factory(String speakerName, String wooferName) {
        // 삼성Tv 객체화 하려면? 스피커 주소값 필요
        // 스피커가 객체화 하려면? 우퍼 주소값 필요
        Woofer woofer = switch (wooferName) {
            case "martin" -> new MartinWoofer();
            case "genelec" -> new GenelecWoofer();
            default -> null;
        };
        Speaker speaker = switch (speakerName) {
            case "jbl" -> new JBLSpeaker(woofer);
            case "harman" -> new HarmanSpeaker(woofer);
            default -> null;
        };

        return new SamsungTv(speaker);
    }
}