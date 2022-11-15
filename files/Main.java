/*
Creator: Mr. Lam 2021. Revised by RUniat 2022.
Description:A Program to code Animal classes while learning about OOP concepts.
Starter includes classes: Main, Cat, Dog, Skunk
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final long initial = System.currentTimeMillis();

        Cat tommy = new Cat("Tommy", 100, 5);
        Dog jerry = new Dog("Jerry", 57, 3);
        Skunk timothy = new Skunk("Timothy", 45, 7);
        Ant joey = new Ant("Joey", 0.1, 0);
        Animal[] pets = new Animal[] {tommy, jerry, timothy, joey};

        while (true) {

            for (Animal pet: pets) {

                if (!pet.isDead()) {

                    pet.age((int) ((System.currentTimeMillis() - initial) / 1000));

                }

            }

        }

    } // close main

}
