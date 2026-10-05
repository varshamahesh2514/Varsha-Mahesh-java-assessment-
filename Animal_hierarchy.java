import java.util.Scanner;
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Fox extends Animal {
    void sound() {
        System.out.println("Fox yelps");
    }
}

class Rabbit extends Animal {
    void sound() {
        System.out.println("Rabbit squeaks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Fox f = new Fox();
        Rabbit r = new Rabbit();

        d.eat();
        d.sound();

        f.eat();
        f.sound();

        r.eat();
        r.sound();
    }
}
