package org.labexercise.designpatterns.Observer;

public class WeatherStationTest {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay();

        ws.registerObserver(currentConditionsDisplay);

        ws.setWeatherData(80, 65, 30.4f);
    }
}
