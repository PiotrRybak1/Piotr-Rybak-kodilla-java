package com.kodilla.testing.collection;
import java.util.*;
import java.lang.*;
public class TestingMain<addScore> {
    public static void main(String[] args) {
        Random theGenerator = new Random();
           ArrayList<Integer>testNumber;
             testNumber = new ArrayList<Integer>();
             for(int k = 0; k < 100; k++){
             testNumber.add(theGenerator.nextInt(200));
       }
        OddNumbersExterminator examinator = new OddNumbersExterminator();
          ArrayList<Integer>  oddScore;

    {
       oddScore = examinator.exterminate(testNumber);
    }
         System.out.println(oddScore);

    }
}