package com.bingoo.designpattern.observer;

import java.util.List;

/**
 * 天气主题
 *
 * @author Administrator
 * @create 2019-08-31-11:12
 */
public class WeatherData implements Subject {
    private float temp;//温度
    private float humidity;//湿度
    private float pressure;//气压
    private List<Observer> observerList;//观察者列表

    public WeatherData(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        if(index >= 0) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i = 0; i < observerList.size(); i++) {
            Observer observer = observerList.get(i);
            observer.update(this.temp,this.humidity, this.pressure);
        }
    }

    public void measurementChanged() {
        //通知观察者
        notifyObservers();
    }
    public void setMeasurement(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
