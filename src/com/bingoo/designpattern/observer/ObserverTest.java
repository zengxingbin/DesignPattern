package com.bingoo.designpattern.observer;

import java.util.ArrayList;

/**
 * 观察者模式测试
 *
 * @author Administrator
 * @create 2019-08-31-11:24
 */
public class ObserverTest {
    public static void main(String[] args) {
        //创建主题
        WeatherData weatherData = new WeatherData(new ArrayList<Observer>());
        //创建观察者对象
        Observer currentCondition = new CurrentConditionObserver(weatherData);
        //注册观察者
        weatherData.registerObserver(currentCondition);
        weatherData.setMeasurement(28,50,90);
    }
}
