package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LinkedList<Box> box = new LinkedList<>();
        box.add(new Box<>(100));
        box.add(new Box<>("san"));

        Box<Integer> box1 = new Box<>(30);
        Box<String> box2 = new Box<>("San");
        
        System.out.println(Box.method(box));
        System.out.println(Box.method(box1));
        System.out.println(Box.method(box2));
    }
}