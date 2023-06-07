package com.dzh.abstractTest.abstractName.car;

public class Test {
    public static void main(String[] args) {
        Vehicle v = new Car();
        System.out.println(v.NoOfWheel());
        Vehicle m = new Motorbike();
        System.out.println(m.NoOfWheel());
    }
}
