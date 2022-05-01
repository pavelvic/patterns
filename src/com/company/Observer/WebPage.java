package com.company.Observer;

public class WebPage implements Listener {
    @Override
    public void onTemperatureChange(String t) {
        System.out.println("Show new temperature on web page " +t);
    }
}
