package se.oscar.adventure;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean running = true;
        while (running) {
            System.out.println("""
                    Choose your path:
                    north
                    south
                    east
                    west
                    quit""");

            switch (scan.nextLine()) {
                case "north" -> System.out.println("Going north");
                case "south" -> System.out.println("Going south");
                case "east" -> System.out.println("Going east");
                case "west" -> System.out.println("Going west");
                case "quit" -> running = false;
                default -> System.out.println("Invalid input");
            }
        }
    }
}