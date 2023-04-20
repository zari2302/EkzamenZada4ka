package main;

import model.Animal;
import model.Cow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal = new Cow();
        animal.setName(scanner.nextLine());
        animal.setColor(scanner.nextLine());
        animal.setAge(scanner.nextInt());
        animal.sleeps();
        System.out.println("Name: " + animal.getName() + "\n" + "Color: " + animal.getColor() + "\n" +
                "Age: " + animal.getAge());
        Runnable runnable = new Cow();
        runnable.run();
        Cow cow1 = new Cow();
        cow1.setName(scanner.nextLine());
        cow1.setColor(scanner.nextLine());
        cow1.setBreed(scanner.nextLine());
        cow1.setAge(scanner.nextInt());
        cow1.run();
        cow1.sleeps();
        cow1.voice();
        System.out.println("name: " + cow1.getName() + "\n" + "Color: " + cow1.getColor() + "\n" +
                "Age: " + cow1.getAge() + "\n" + "Breed: " + cow1.getBreed());

    }
}