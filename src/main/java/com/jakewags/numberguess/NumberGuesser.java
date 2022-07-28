package com.jakewags.numberguess;

import java.util.Scanner;

/*
 THIS IS DESIGNED AS AN EXAMPLE PROGRAM FOR A FRIEND
 THIS PROGRAM DOES NOT CONFORM TO TDD STANDARDS

 The program should generate a number 1-n, where the user inputs n. The user should also input the number of turns they will have.
 After generation, the user should use their turns to guess a number (1-n). The program will provide the user with feedback about whether their guess was above or below the number.
 If the user succeeds, the game will end. If the user runs out of turns, the game will end.
 */
public class NumberGuesser {
    public static void play() {
        // Scanner is used to get user input or read files
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the guessing game.");
        System.out.print("Please select a maximum number (1-?): ");
        int n = scanner.nextInt();

        System.out.print("Please select the number of turns you will have: ");
        int turns = scanner.nextInt();

        int num = generateNumber(n);

        int guess = -1;
        while(guess != num && turns > 0) {
            turns--;
            guess = getUserGuess(scanner);
            processGuess(guess, num);
            System.out.println("You have " + turns + " turn(s) remaining.");
        }

        if (turns == 0) {
            gameOver(false, num, turns);
        } else {
            gameOver(true, num, turns);
        }

        System.out.println("Would you like to play again? (Y/N)");
        if (scanner.next().equals("Y")) {
            play();
        }
    }

    private static void gameOver(boolean win, int num, int turns) {
        if (win) {
            System.out.println("Congratulations! You've won!");
            System.out.println("You had " + turns + " turn(s) remaining.");
        }
        if (win == false) {
            System.out.println("You lost!");
            System.out.println("The number was: " + num);
        }
    }

    private static void processGuess(int guess, int num) {
        if (guess > num) {
            System.out.println("Your guess was too high!");
        }
        if (guess < num) {
            System.out.println("Your guess was too low!");
        }
    }

    private static int generateNumber(int n) {
        return (int)(Math.random() * n);
    }

    private static int getUserGuess(Scanner scanner) {
        System.out.println("===============================");
        System.out.print("Please input your guess: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        play();
    }

}
