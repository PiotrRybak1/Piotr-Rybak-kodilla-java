package com.kodilla.spring.calculator;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
         double sum = calculator.add(0.0,1.0);
        //Then
        Assert.assertEquals(1.0,sum,0.1);
    }

    @Test
    public void testSub() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
         double subtraction = calculator.sub(2.0,1.0);
        //Then
        Assert.assertEquals(1.0,subtraction,0.1);
    }

    @Test
    public void testMul() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
         double multiplication  = calculator.mul(1.0,1.0);
        //Then
        Assert.assertEquals(1.0,multiplication,0.1);
    }
    @Test
    public void testDiv() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
         double division = calculator.div(1.0,1.0);
        //Then
        Assert.assertEquals(1.0,division,0.1);
    }
}

