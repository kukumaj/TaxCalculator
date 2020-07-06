package com.company;

public class Main {

    public static void main(String[] args) {
        TaxCalculator calculator = getCalculator();
        calculator.calculateTax();
        System.out.println("oko0");
    }
    public static TaxCalculator getCalculator(){
        return new TaxCalculator2020();
    }
}
