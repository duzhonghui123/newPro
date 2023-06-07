package com.dzh.collectionTest;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        System.out.println(sites.get(1));
        System.out.println(sites.set(1, "ticktock"));
        System.out.println(sites);


    }

}
