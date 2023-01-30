package org.example;
import java.util.*;
import java.util.random.RandomGenerator;

public class GuessANumber {
    public static void main(String []args) {
        int to_guess = (RandomGenerator.getDefault().nextInt() % 100) + 1;
        int guess = -1;
        int tries = 0;
        Scanner sc = new Scanner(System.in);
        if (to_guess < 0) {
            to_guess *= -1;
        }
        while (guess != to_guess) {
            tries++;
            System.out.printf("Your guess? ");
            guess = sc.nextInt();
            if (guess < to_guess) {
                System.out.printf("Too low!\n");
            } else if (guess > to_guess) {
                System.out.printf("Too high!\n");
            }
        }
        if (tries == 1) {
            System.out.printf("It took you %d try.\n", tries);
        } else {
            System.out.printf("It took you %d tries.\n", tries);
        }
    }
}
