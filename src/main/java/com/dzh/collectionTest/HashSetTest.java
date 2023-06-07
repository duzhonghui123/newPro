package com.dzh.collectionTest;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> sites = new HashSet<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");
        for (String i : sites){
            System.out.println(i);
        }
    }
}
