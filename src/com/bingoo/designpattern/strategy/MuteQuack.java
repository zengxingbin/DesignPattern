package com.bingoo.designpattern.strategy;

/**
 * 不会叫
 *
 * @author Administrator
 * @create 2019-08-31-10:04
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Slience >>");
    }
}
