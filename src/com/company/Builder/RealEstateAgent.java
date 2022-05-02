package com.company.Builder;

public class RealEstateAgent {
    HouseBuilder houseBuilder;

    public RealEstateAgent(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House createHouse (KindOfLux kindOfLux) {
        switch (kindOfLux) {
            case BASIC:
                break;
            case LOW:
                houseBuilder.setGarage(true);
                houseBuilder.setSwimmingPool(false);
                houseBuilder.setGarden(false);
                houseBuilder.setRooms(2);
                houseBuilder.setKitchenSize(7.2);
                break;

            case MEDIUM:
                houseBuilder.setGarage(true);
                houseBuilder.setSwimmingPool(false);
                houseBuilder.setGarden(true);
                houseBuilder.setRooms(3);
                houseBuilder.setKitchenSize(13.4);
                break;

            case HIGH:
                houseBuilder.setGarage(true);
                houseBuilder.setSwimmingPool(true);
                houseBuilder.setGarden(true);
                houseBuilder.setRooms(3);
                houseBuilder.setKitchenSize(20.6);
                break;
        }
        return houseBuilder.getResult();
    }
}