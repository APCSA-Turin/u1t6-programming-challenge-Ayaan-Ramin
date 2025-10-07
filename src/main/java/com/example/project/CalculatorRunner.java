package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        //2. call any methods of that class to test
        Calculator myCalc = new Calculator("TI-84 Plus");

        System.out.println(myCalc.info());
        System.out.println("Add: " + myCalc.performOperation("+", 10, 5));
        System.out.println("Subtract: " + myCalc.performOperation("-", 10, 5));
        System.out.println("Multiply: " + myCalc.performOperation("*", 10, 5));
        System.out.println("Divide: " + myCalc.performOperation("/", 10, 5));
        System.out.println("Divisible: " + myCalc.divisibleBy(10, 5));
        System.out.println("Coordinate: " + myCalc.coordinatePair(3, 7));
        System.out.println("Absolute Value: " + myCalc.absoluteValue(3, 7));
        System.out.println("Average: " + myCalc.average(7, 8));

    }
}
