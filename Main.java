import animals.Dog;
import animals.Cat;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();
    }
}