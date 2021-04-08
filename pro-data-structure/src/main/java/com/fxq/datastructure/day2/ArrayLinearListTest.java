package com.fxq.datastructure.day2;

public class ArrayLinearListTest {
    public static void main(String[] args) {
        ArrayLinearList<String> list = new ArrayLinearList<>();
        System.out.println(list.size());
        list.add("hello",0);
        System.out.println(list.size());
        String element = list.get(0);
        System.out.println(element);
        list.remove(0);
        System.out.println(list.size());
        System.out.println(list.get(0));
    }
}
