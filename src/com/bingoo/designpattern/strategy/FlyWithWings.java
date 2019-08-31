package com.bingoo.designpattern.strategy;

/**
 * 用翅膀飞行
 *
 * @author Administrator
 * @create 2019-08-31-10:01
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
