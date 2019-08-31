package com.bingoo.designpattern.strategy;

/**
 * 呱呱叫
 *
 * @author Administrator
 * @create 2019-08-31-10:03
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
