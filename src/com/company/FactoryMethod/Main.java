package com.company.FactoryMethod;

import java.util.Scanner;

public class Main {
    static Logistic logistic;

    static void init(String type) throws Exception {
        switch(type.toLowerCase()) {
            case "t":
                logistic = new TruckLogistic();
                break;
            case "s":
                logistic = new ShipLogistic();
                break;
            default:
                //System.out.println("Input Error (t - delivery by truck, s - delivery by ship)");
                throw new Exception("Invalid Input ["+type+"] 't' - delivery by truck, 's' - delivery by ship)\"");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose delivery type. 't' - delivery by truck, 's' - delivery by ship)");
        String type = in.nextLine();
        try {
            init(type);
            logistic.getTransport().deliver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
