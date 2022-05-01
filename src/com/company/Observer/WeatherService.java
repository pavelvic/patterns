package com.company.Observer;


import java.util.HashSet;
import java.util.Set;

public class WeatherService {
    Set<Listener> listenerList = new HashSet<>();

    void addListener (Listener listener) {
        listenerList.add(listener);
    }

    void deleteListener (Listener listener) {
        listenerList.remove(listener);
    }

    void changeTemperature (String temperature) {
        listenerList.forEach(p->p.onTemperatureChange(temperature));
    }
}
