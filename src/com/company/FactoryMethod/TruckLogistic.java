package com.company.FactoryMethod;

public class TruckLogistic implements Logistic {
    @Override
    public Transport getTransport() {
        return new Truck();
    }
}
