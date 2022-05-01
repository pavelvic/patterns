package com.company.Observer;

public class Logger implements Listener {
    @Override
    public void onTemperatureChange(String t) {
        System.out.println("Logging new temperature " + t);
    }
}
