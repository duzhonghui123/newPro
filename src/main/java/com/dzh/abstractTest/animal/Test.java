package com.dzh.abstractTest.animal;

public class Test {
    public static void main(String[] args) {
        show(new Cat());
        show(new Dog1());
        Animal1 a = new Cat();
        a.eat();
        Cat c = new Cat();
        c.work();
    }

    public static void show(Animal1 a) {
        a.eat();
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.work();
        } else if (a instanceof Dog1) {
            Dog1 d = (Dog1) a;
            d.work();
        }
    }
}
