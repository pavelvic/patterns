package com.company.Builder;

public class House {
    private final boolean garage;
    private final boolean swimmingPool;
    private final boolean garden;
    private final int rooms;
    private final double kitchenSize;

    public House(boolean garage, boolean swimmingPool, boolean garden, int rooms, double kitchenSize) {
        this.garage = garage;
        this.swimmingPool = swimmingPool;
        this.garden = garden;
        this.rooms = rooms;
        this.kitchenSize = kitchenSize;
    }

    @Override
    public String toString() {
        return "House\n" +
                "has garage: " + garage +"\n"+
                "has swimming pool: " + swimmingPool + "\n"+
                "has garden: " + garden + "\n"+
                "rooms: " + rooms + "\n"+
                "kitchen size: " + kitchenSize + "\n";
    }
}
