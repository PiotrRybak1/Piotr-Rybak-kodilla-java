package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;


public class OddNumbersExterminator {

    ArrayList<Integer> oddNumbers = new ArrayList<Integer>();


    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        if (numbers.size() !=0) {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0) {
                    oddNumbers.add(numbers.get(i));
                }
            }
        }
            else {
                for (int k = 0; k< numbers.size(); k++) {
                    oddNumbers.add(null);
                }
            ;}

        return oddNumbers;
    }
}
