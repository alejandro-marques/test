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
    }
}