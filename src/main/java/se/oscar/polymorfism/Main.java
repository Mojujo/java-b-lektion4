package se.oscar.polymorfism;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        car.move();
        bicycle.move();
        System.out.println();

        Animal cat = new Cat();
        Animal dog = new Dog();

        cat.makeSound();
        cat.sleep();
        System.out.println();


        dog.makeSound();
        dog.sleep();
        System.out.println();


        Dog dog1 = new Dog();

        dog1.makeSound();
        dog1.sleep();
        dog1.fetch();
    }
}
