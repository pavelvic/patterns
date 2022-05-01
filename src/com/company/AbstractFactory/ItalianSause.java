package com.company.AbstractFactory;

public class ItalianSause implements Sause {
    @Override
    public void getCost() {
        System.out.println("ItalianSause for 1 dollar");
    }
}
