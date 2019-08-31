package com.bingoo.designpattern.strategy;

/**
 * 无法飞行
 *
 * @author Administrator
 * @create 2019-08-31-10:02
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
