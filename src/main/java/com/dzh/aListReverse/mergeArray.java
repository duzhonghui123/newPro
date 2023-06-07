package com.dzh.aListReverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeArray {
    public static void main(String[] args) {
        String a[] = {"A", "B", "C"};
        String b[] = {"a", "b"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));


    }
}
