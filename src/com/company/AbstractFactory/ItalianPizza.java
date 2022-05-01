package com.company.AbstractFactory;

public class ItalianPizza implements Pizza {
    @Override
    public void getCost() {
        System.out.println("ItalianPizza for 10 dollars");
    }
}
