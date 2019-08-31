package com.bingoo.designpattern.strategy;

/**
 * @author Administrator
 * @create 2019-08-31-10:06
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
