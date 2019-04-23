package com.example.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: demo
 * @auther: shiwei
 * @date: 2019/4/23 09:25
 * @description: TODO
 */
public class HelloWorld {
    public static void main(String[] args) {
        List list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        list.add("f");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("i: " + list.get(i));
        }

    }
}
