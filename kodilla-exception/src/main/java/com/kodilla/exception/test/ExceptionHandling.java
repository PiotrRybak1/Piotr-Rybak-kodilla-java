package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args){
        SecondChallenge secondChallenge = new SecondChallenge();

        try{
            String probablyIWillThrowExceptionResult = secondChallenge.probablyIWillThrowException(5.0,2.5);
            System.out.println(probablyIWillThrowExceptionResult);

        } catch (Exception e) {
            System.out.println("A problem has occurred, look:  " + e );

        }finally {
         System.out.println(" Remember the range of your numbers must be different than: x >= 2 || x < 1 || y == 1.5");

        }
    }
}
