package ch06.sec04;

public class Student {
    String name;
//  memberfield : data 저장
    public Student() {
//  public void Student() { 시 "기본 생성자 호출"이 뜨지 않음
        System.out.println("기본 생성자 호출!");
    }

    public void introduce() {
        int num;
        System.out.printf("안녕 내 이름은 %s이라고 해\n", this.name);
    }
}
