package com.kodilla.kodillacourse;
import java.util.*;
import java.lang.*;
import java.io.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCourseApplication.class, args);


        FirstClass firstClass = new FirstClass(60,98);
        int addNumbers = firstClass.addNumber();
        int subtractionNumbers = firstClass.subtractionNumber();
        System.out.println("Add = " + addNumbers + " Substracion = " + subtractionNumbers);
    }


}