package chapter_2;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    private ArrayList<java.util.Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList();
    }
//
//    @Override
//    public void registerObserver(Observer o) {
//        observers.add(o);
//    }
//
//    @Override
//    public void removeObserver(Observer o) {
//        int i = observers.indexOf(o);
//        if(i >= 0){
//            observers.remove(i);
//        }
//    }



//    @Override
//    public void notifyObservers() {
//        for(int i = 0 ; i < observers.size() ; i++){
//            java.util.Observer observer = observers.get(i);
//            observer.update(this , 0);
//        }
//
//    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature , float humidity , float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
