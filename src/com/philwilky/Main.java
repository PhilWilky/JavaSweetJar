package com.philwilky;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create instance of Random class
        Random rand = new Random();

        // generate random integers in range 0 to 1500
        int sweetCount = rand.nextInt(1501);

        // Keep a track on how many guesses the user made
        int numGuess = 0;

        // getting user input
        System.out.println("Hello, what is your name: ");

        // instantiate a new scanner and use scanner to get player name and store in a
        // string
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();
        System.out.println("Welcome " + name + ", can you guess how many sweets are in the jar?");

        guessLoop(sweetCount, scName, numGuess);
    }

    private static void guessLoop(int sweetCount, Scanner scName, int numGuess) {
        for (int i = 0; i == 0;) {

            // get the players guess
            int pGuess = scName.nextInt();

            // if to check the users guess
            if (pGuess == sweetCount) {
                i = 1;
                numGuess++;
                System.out.println("Phil, You got it in '" + numGuess + "' Guesses");
                System.out.println("Well Done!");
            }
            if (pGuess < sweetCount) {
                System.out.println("Nope! Try HIGHER");
                numGuess++;
            }
            if (pGuess > sweetCount) {
                System.out.println("Nope! Try LOWER");
                numGuess++;
            }

            // Improvements
            // Added numberOfGusses 'numGuess' ✓
            // Add high score (maybe a writable file)
            // Add a 'little' higher or lower prompt if ~50
            // Erorr Catching

        }
    }
}