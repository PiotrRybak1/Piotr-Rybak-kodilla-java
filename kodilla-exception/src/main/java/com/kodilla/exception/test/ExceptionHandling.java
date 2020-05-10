package com.kodilla.exception.test;

        public class ExceptionHandling {
            public static void main(String[] args) {
                SecondChallenge secondChallenge = new SecondChallenge();
                try {
                    String secondChallengeResult = secondChallenge.probablyIWillThrowException(1.0, 2.0);
                    System.out.println(secondChallengeResult);

                } catch (Exception e) {
                    System.out.println("There is a problem check it out: " + e);
                } finally {
                    System.out.println("Remember your numbers must be different from: (x >= 2 || x < 1 || y == 1.5)");

                }
            }
        }
