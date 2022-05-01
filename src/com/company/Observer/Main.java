package com.company.Observer;

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();
        weatherService.addListener(new Email());
        weatherService.addListener(new WebPage());
        weatherService.changeTemperature("25");

        weatherService.addListener(new Logger());
        weatherService.changeTemperature("-1");
    }
}
