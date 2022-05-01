package com.company.Observer;

public class Email implements Listener {
    @Override
    public void onTemperatureChange( String t) {
        System.out.println("Send e-mail with new temperature "+t);
    }
}
