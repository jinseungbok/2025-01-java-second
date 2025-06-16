package blackjack;

import java.util.Scanner;

public class Game {
    private static final int INIT_RECEIVE_CARD_COUNT = 2;
    public static void main(String[] args) {
        CardDeckResult02 cd = new CardDeckResult02();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();

        initPhase(cd, dealer, gamer); // 초기 세팅
        playPhase(cd, dealer, gamer);
    }

    private static void initPhase(CardDeckResult02 cd, Dealer dealer, Gamer gamer) {
        for (int i = 0; i < INIT_RECEIVE_CARD_COUNT; i++) {
            gamer.receiveCard(cd.getCard());
            dealer.receiveCard(cd.getCard());
        }
        // dealer 가 가진 카드의 점수가 17점 미만이면 1장 더 받음
        if (dealer.needMoreCard()) {
            dealer.receiveCard(cd.getCard());
        }
    }
    private static void playPhase(CardDeckResult02 cd, Dealer dealer, Gamer gamer) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            gamer.showCards();
            System.out.print("카드를 더 뽑겠습니까? (종료: 0) ");
            String answer = scanner.next();
            if("0".equals(answer)) {
                break;
            }
            gamer.receiveCard(cd.getCard());
        }
        Rule.getWinner(dealer, gamer);
        System.out.println("---Dealer card---");
        dealer.showCards();
        scanner.close();
    }
}