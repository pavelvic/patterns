package com.company.Builder;

public class HouseBuilder {
    private boolean garage = false;
    private boolean swimmingPool = false;
    private boolean garden = false;
    private int rooms = 1;
    private double kitchenSize = 5.0;

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setKitchenSize(double kitchenSize) {
        this.kitchenSize = kitchenSize;
    }

    public House getResult () {
        return new House(garage,swimmingPool,garden,rooms,kitchenSize);
    }
}
