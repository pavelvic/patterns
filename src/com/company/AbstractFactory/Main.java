package com.company.AbstractFactory;

import java.util.Scanner;

public class Main {
    private static PizzaFactory pizzaFactory;
    private static Pizza pizza;
    private static Sause sause;

    static PizzaFactory configurePizza (String type) {
        if (type.equals("a")) return new AmericanPizzaFactory();
        if (type.equals("i")) return new ItalianPizzaFactory();
        return new AmericanPizzaFactory(); //by default
    }

    public static void main(String[] args) {
        System.out.println("What kind of pizza do you need? (a - American, i - Italian)");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(input);
        pizzaFactory = configurePizza(input);
        pizza = pizzaFactory.createPizza();
        sause = pizzaFactory.createSauce();
        pizza.getCost();
        sause.getCost();
    }
}

