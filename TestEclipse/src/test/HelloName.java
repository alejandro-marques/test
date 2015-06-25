package test;

import java.util.Scanner;

/**
 * Created by alejandro on 25/06/15.
 */
public class HelloName {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello, what's your name?");
        String name = keyboard.nextLine();
        System.out.println("Nice to meet you " + name);

        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        if (age < 18){
            System.out.println("You must be over 18 to talk with me");
        }
        else {
            System.out.println("Speak friend and enter.");
        }
    }
}
