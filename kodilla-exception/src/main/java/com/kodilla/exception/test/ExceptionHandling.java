package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(2, 3);
        } catch (Exception e) {
            System.out.println("Exception occured");
        } finally {
            System.out.println("This will always be here");
        }
    }
}
