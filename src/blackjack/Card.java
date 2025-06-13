package blackjack;

public class Card {
    private String pattern;
    private String denomination;
    // final 넣을 수 있으나 보수적으로 작업하는 경우가 많기에 잘 넣지 않음

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }
    // 기본 생성자
    // 클래스에 생성자 선언이 없을 경우 컴파일러가 자동 생성
    // parameter가 없는 유형

    // 생성자, 메소드 차이 (2가지)
    // [1] 리턴 타입 없음 [2] 클래스 이름과 동일

    // 생성자는 왜 만드는가?
    // new 연산자로 객체를 생성할 때 객체를 초기화하기 위함
    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }

    // getter는 return을 필요로 하여 값을 읽어올 수 있게 해줌
    // setter는 this.변수명을 필요로 하며 값을 외부에서 설정할 수 있게 해줌
    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", this.pattern, this.denomination);
    }
}