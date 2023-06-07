package com.dzh.abstractTest.abstractTest;

public abstract class SuperClass {
    abstract void m();
}

class SubClass extends SuperClass {
    void m() {
        System.out.println("wjl is pig.");
    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.m();
        System.out.println("我的名字是：".concat("Runoob"));
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob...");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8, "java");
        System.out.println(sb);
        sb.delete(2, 4);
        System.out.println(sb);
    }
}


