package test;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        // Asks for your name
        System.out.println("Hello, what's your name?");
        String name = keyboard.nextLine();

        name = name.substring(0,1).toUpperCase() + name.substring(1);

        System.out.println("Nice to meet you " + name);
    }
}
