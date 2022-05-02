package com.company.Builder;

public class Main {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        RealEstateAgent realEstateAgent = new RealEstateAgent(houseBuilder);
        House myHouse = realEstateAgent.createHouse(KindOfLux.BASIC);
        System.out.println(myHouse);
    }
}
