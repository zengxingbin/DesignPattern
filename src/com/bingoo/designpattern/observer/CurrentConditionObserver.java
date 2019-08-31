package com.bingoo.designpattern.observer;

/**
 * 目前天气状况
 *
 * @author Administrator
 * @create 2019-08-31-11:19
 */
public class CurrentConditionObserver implements Observer {
    private float temp;
    private float humidity;
    private Subject subject;

    public CurrentConditionObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("Current condition:temp:" + temp + "F humidity:" +  humidity + "%");
    }
}
