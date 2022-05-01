package com.company.AbstractFactory;

public class AmericanSause implements Sause {
    @Override
    public void getCost() {
        System.out.println("AmericanSause for 2 dollars");
    }
}
