package com.bingoo.designpattern.observer;

/**
 * Created by Administrator on 2019/8/31 0031.
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
