package ch07.sec07.poly2;

// capsule
// 본인이 보유한 소유 금액 저장 가능 (money)
// 소유 금액은 만 원 단위이면 1천만 원을 기본적으로 지님
// 제품 구매 시 보너스 점수를 저장할 수 있음 (bonusPoint)
// 컴퓨터, 티비를 구매할 수 있음. buy method
// 구매 시 제품 가격만큼 소유 금액은 차감
// 구매 시 구매한 제품 이름이 출력된다.
// e.g. "Tv을/를 구입하였습니다."
// e.g. "Computer을/를 구입하였습니다."
// 구매 시 구매 포인트 적립
// 구매 시 소유 금액이 부족하면 "잔액이 부족합니다."
// 내용이 출력되면서 구매하지 않는다.
public class Buyer {
    private int money = 1000;
    private int bonusPoint;

    public Buyer() {

    }

    //  public Buyer() {
//      this.money = 1_000;
//  }
    // getter 메소드
    public int getMoney() {
    return money;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public Buyer(int bonusPoint) {
        this.bonusPoint = bonusPoint;
    }

    public void buy(Product product) {
        if(product.getPrice() > this.money) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        this.money -= product.getPrice();
        this.bonusPoint += product.getBonuspoint();

        System.out.println(product + "을/를 구입하였습니다.");
    }
}