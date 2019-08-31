package com.bingoo.designpattern.strategy;

/**
 * 鸭子抽象类
 *
 * @author Administrator
 * @create 2019-08-31-9:56
 */
public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();
    public void swim() {
        System.out.println("All ducks float,evem decoys");
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
