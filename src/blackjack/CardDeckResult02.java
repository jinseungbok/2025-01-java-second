
package blackjack;

public class CardDeckResult02 {
    private String[] patterns = {"Spade", "Heart", "Diamond", "Clover"};
    private Card[] cards = new Card[52];
    private int selectedIdx = 0;

    public CardDeckResult02() {
        int index = 0;
        for (int i = 0; i < patterns.length; i++) {
            for (int k = 1; k <= 13; k++) {
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

    private void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int rIdx = (int) (Math.random() * cards.length);
            Card temp = cards[rIdx];
            cards[rIdx] = cards[i];
            cards[i] = temp;
        }
    }

    public Card getCard() {
        if(selectedIdx == cards.length) {
            return null;
        }
            Card c = cards[selectedIdx];
            cards[selectedIdx++] = null;
            return c;
        }
    //  if (selectedIdx < cards.length) {
    //      return cards[selectedIdx++];
    //  }
    //  return null;

    public void printAllCards() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    @Override
    public String toString() {
        return "나는 카드덱이야";
    }
}
