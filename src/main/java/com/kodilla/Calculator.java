package com.kodilla;

public class Calculator {
    public int additionAtoB(int a, int b){
        System.out.println("The result equals: " + (a+b));
        return a+b;
    }
    public int substractionAfromB(int c, int d){
        System.out.println("The result equals: " + (c-d));
        return c-d;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.additionAtoB(6,4);
        calculator.substractionAfromB(7,2);
        System.out.println("It Works!");
    }
}
