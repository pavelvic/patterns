package com.company.AbstractFactory;

public class AmericanPizza implements Pizza {
    @Override
    public void getCost() {
        System.out.println("AmericanPizza for 15 dollars");
    }
}
