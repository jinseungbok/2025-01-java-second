package blackjack;

public class CardDeckResult {
    private String[] patterns = {"Spade", "Heart", "Diamond", "Clover"};
    private Card[] cards = new Card[52];
    // card는 카드 객체 52개의 주소값을 저장한 객체에게 접근할 수 있다
    // 각 방 현재 null 값

    public CardDeckResult() {
    // 각 방에 어떤 값만 들어갈 수 있는가? Card 객체 주소값
    // 모든 방에 모두 다른 주소값을 넣는다.
    // 각 카드가 가지고 있는 값도 모두 달라야 함.
    // 패턴은 Spade, Heart, Clover, Diamond
    // denomination A, 2, 3, 4, 5, 6, 7, 8 ,9 ,10, J, Q, K
    // 13장 패턴은 모두 Spade, Heart, Clover, Diamond

        int index = 0;
        for (int i = 0; i < patterns.length; i++) { // 4
            for (int k = 1; k <= 13; k++) { // 13
                String denomination = switch (k) {
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(k);
                };
                cards[index++] = new Card(patterns[i], denomination);
            }
        }
        shuffle(); // 생성자에서 덱을 자동으로 섞음
    }

    // 내부적으로 사용하는 메소드
    private void shuffle() {
        for (int i = cards.length - 1; i>0; i--) {
            int k = (int) (Math.random() * (i+1));
            Card temp = cards[i];
            cards[i] = cards[k];
            cards[k] = temp;
        }
    }

    public void printAllCards() {
        for (Card card : cards) {
            // System.out.printf("%s (%s)\n", card.getPattern(), card.getDenomination());
            System.out.println(card);
        }
    }

    @Override // 에노테이션
    public String toString() {
        return "나는 카드덱이야";
    }
}