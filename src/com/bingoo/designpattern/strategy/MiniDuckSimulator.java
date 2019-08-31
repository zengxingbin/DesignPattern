package com.bingoo.designpattern.strategy;

/**
 * 测试类
 *
 * @author Administrator
 * @create 2019-08-31-10:10
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        //创建行为类
        FlyBehavior flyBehavior = new FlyWithWings();
        QuackBehavior quackBehavior = new Quack();
        //创建绿头鸭
        Duck mallardDuck = new MallardDuck(flyBehavior, quackBehavior);
        mallardDuck.performFly();
        mallardDuck.performQuack();
        //运行时改变鸭子的行为
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new MuteQuack());
        mallardDuck.performFly();
        mallardDuck.performQuack();

    }
}
