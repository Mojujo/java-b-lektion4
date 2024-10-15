package se.oscar.polymorfism;

public class Bicycle implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bicycle is moving...");
    }
}
