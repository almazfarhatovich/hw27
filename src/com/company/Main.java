package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Box<String> box = new Box<>("Размер");
        Box<Integer> box1 = new Box<>(30);
        
        System.out.println(Box.var(box));
        System.out.println(Box.var(box1));
    }
}