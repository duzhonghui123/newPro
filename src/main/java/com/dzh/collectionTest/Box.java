package com.dzh.collectionTest;

public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        integerBox.add(new Integer(10));
        stringBox.add(new String("菜鸡教程"));
        System.out.printf("整型值为：%d", integerBox.get());
        System.out.printf("字符串值为：%s", stringBox.get());

    }

}
