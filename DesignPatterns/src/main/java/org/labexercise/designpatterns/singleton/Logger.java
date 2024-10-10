package org.labexercise.designpatterns.singleton;

public class Logger {

    public void log(String message) {
        System.out.println(message);
    }

    public void logWithCapitals(String message, Boolean isCapital) {
        if (isCapital) {
            System.out.println(message.toUpperCase());
        } else {
            System.out.println(message.toLowerCase());
        }
    }

}
