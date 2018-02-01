package chapter_2;

import java.util.Observable;

public class CurrentConditionsDisplay implements java.util.Observer , DisplayElement {
    private float temperature;
    private float humidity;
    private Observable weatherData;


    public CurrentConditionsDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
        System.out.println("Heat index is " + new HeatIndexDisplay().computeHeatIndex(temperature , humidity));
    }

    @Override
    public void update(Observable o, Object arg) {



        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }else {

        }

    }

//    @Override
//    public void update(float temperature , float humidity, float pressure) {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();
//    }
}
