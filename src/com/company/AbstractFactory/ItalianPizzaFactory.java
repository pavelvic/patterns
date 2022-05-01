package com.company.AbstractFactory;

public class ItalianPizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new ItalianPizza();
    }

    @Override
    public Sause createSauce() {
        return new ItalianSause();
    }
}
