package FactoryMethod;

public class ShipLogistic implements Logistic {
    @Override
    public Transport getTransport() {
        return new Ship();
    }
}
