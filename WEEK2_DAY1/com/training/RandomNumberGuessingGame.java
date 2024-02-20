package com.training;
import java.util.Random;

public class RandomNumberGuessingGame {
    private static int targetNumber;
    private static int totalAttempts = 0;
    private static boolean numberGuessed = false;

    public static void main(String[] args) {
        Random random = new Random();
        targetNumber = random.nextInt(10); // Generating a random number between 0 and 9

        Runnable guesser = () -> {
            int guess;
            while (!numberGuessed) {
                synchronized (RandomNumberGuessingGame.class) {
                    guess = random.nextInt(10);
                    totalAttempts++;
                    if (guess == targetNumber) {
                        numberGuessed = true;
                        System.out.println("Thread " + Thread.currentThread().getName() + " guessed the number " + guess + " correctly!");
                        System.out.println("Total attempts: " + totalAttempts);
                    } else {
                        System.out.println("Thread " + Thread.currentThread().getName() + " guessed " + guess + " and it was incorrect.");
                    }
                }
            }
        };

        Thread thread1 = new Thread(guesser, "Thread 1");
        Thread thread2 = new Thread(guesser, "Thread 2");
        Thread thread3 = new Thread(guesser, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

