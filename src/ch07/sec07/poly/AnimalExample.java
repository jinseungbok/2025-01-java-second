package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();

        animalCrying(cat);
        animalCrying(tiger);
        animalCrying(cow);
        animalCrying(dog);
    }

    public static void animalCrying(Animal animal) {
        animal.crying();
    }
//  public static void animalCrying(Cat cat) {cat.crying();}
//  public static void animalCrying(Tiger tiger) {tiger.crying();}
//  public static void animalCrying(Cow cow) {cow.crying();}
}
