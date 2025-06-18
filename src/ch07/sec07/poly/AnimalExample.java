package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BullDog bulldog = new BullDog();


        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
        animalCrying(bulldog);
        // 불독 월~월~
        // 불독이 점프한다.
    }

    public static void animalCrying(Animal animal) {
        animal.crying();
        // Dog jump 메소드 호출
        // 1. jump() 메소드를 호출하려면 타입이 Dog가 되어야 함
        // 2. Dog 객체가 들어왔을 때만 Dog 타입으로 형변환을 해야 함
        if(animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.jump();
        }

    }
//  public static void animalCrying(Cat cat) {cat.crying();}
//  public static void animalCrying(Tiger tiger) {tiger.crying();}
//  public static void animalCrying(Cow cow) {cow.crying();}
}
