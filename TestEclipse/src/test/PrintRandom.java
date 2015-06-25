package test;

import java.util.Random;

public class PrintRandom {
    public static void main(String[] args) {
        // Prints a random number
        System.out.println("Random number: " + new Random().nextInt());

        System.out.println("Random number [0-10]: " + new Random().nextInt(11));
    }
}
