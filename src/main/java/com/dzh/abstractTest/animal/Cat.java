package com.dzh.abstractTest.animal;

public class Cat extends Animal1 {
    @Override
    void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}
