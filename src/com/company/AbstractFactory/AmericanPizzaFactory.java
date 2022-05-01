package com.company.AbstractFactory;

public class AmericanPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new AmericanPizza();
    }

    @Override
    public Sause createSauce() {
        return new AmericanSause();
    }
}
