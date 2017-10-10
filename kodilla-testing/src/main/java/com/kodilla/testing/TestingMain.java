package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Test Calculator");
        Calculator calculator = new Calculator();

        System.out.println("Test method add");
        if (calculator.add(2, 2) == 4){
            System.out.println("Test passed.");
        } else{
            System.out.println("Something went wrong here!");
        }

        System.out.println("Test method subtract");
        if (calculator.subtract(2, 2) == 0){
            System.out.println("Test passed.");
        } else{
            System.out.println("Something went wrong here!");
        }
    }
}