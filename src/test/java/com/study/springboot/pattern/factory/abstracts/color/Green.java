package com.study.springboot.pattern.factory.abstracts.color;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}