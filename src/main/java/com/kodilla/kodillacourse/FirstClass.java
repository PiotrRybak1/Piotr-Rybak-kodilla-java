package com.kodilla.kodillacourse;

public class FirstClass {
    int number1;
    int number2;
    public FirstClass( int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public int addNumber() {
        return number1 + number2;
    }
    public int subtractionNumber(){
         if(number1 >= number2){
             return number1 - number2;
         }
         else {
            return number2 - number1;
         }
         }
    }
