package ch07.sec07.poly2;

public abstract class Productresult {

    // price, bonuspoint 저장할 필드(private + final = 캡슐화 + 불변)
    private final int price;
    private final int bonuspoint;
    // 제품의 가격 정보를 저장할 수 있음 (price)
    // 제품 구매 시 제공하는 보너스 점수 저장할 수 있음 (bonuspoint)
    // capsule, immutable
    // 외부에 값을 보내줄 수 있다.

    // 생성자 통해 값 설정(1번만 설정 가능)
    public Productresult(int price, int bonuspoint) {
        this.price = price;
        this.bonuspoint = bonuspoint;
    }

    // 외부에서 값을 얻을 수 있도록 getter method 제공
    public int getPrice() {
        return price;
    }
    public int getBonuspoint() {
        return bonuspoint;
    }
}
