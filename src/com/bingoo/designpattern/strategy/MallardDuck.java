package com.bingoo.designpattern.strategy;

/**
 * 绿头鸭
 *
 * @author Administrator
 * @create 2019-08-31-10:07
 */
public class MallardDuck extends Duck {

    public MallardDuck() {

    }
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard Duck");
    }
}
