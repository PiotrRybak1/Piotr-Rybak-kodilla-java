package com.kodilla.testing;

import jdk.nashorn.internal.ir.debug.ObjectSizeCalculator;

public class TestingMain {
    public static void main(String[] args){
        Calculator calculator = new Calculator(515,312);
        Calculator calculator1 = new Calculator(312,515);
        int addResult = calculator.addNumber();
        int subResult = calculator.subtractionNumber();
        int subResult1 = calculator1.subtractionNumber();

        if (addResult == 827){
            System.out.println("addNumber() test OK");
        }

            else {
            System.out.println("Error");
        }
            if(subResult == 203 && subResult == subResult1){
                System.out.println("subtractionNumber() test OK");}
            else{
                System.out.println("Error");
            }


    }
}

