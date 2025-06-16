package ch15;

import java.util.*;

public class ArrayListStudy {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // 다형성 - 오로지 상속관계만 가능
        // <String> 제네릭(Generic), 제한
        // 오로지 String 객체 주소값만 담을 수 있는 컬렉션
        Card card = new Card("", "");
        // list.add(card); 안 담긴다.
    }
}
