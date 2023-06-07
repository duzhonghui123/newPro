package com.dzh.abstractTest.animal;

public class Dog1 extends Animal1 {
    @Override
    void eat() {
        System.out.println("吃骨头");
    }

    public void work() {
        System.out.println("看家");
    }
}
