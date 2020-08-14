package com.study.springboot.pattern.factory.factory;

import com.maoqudiaoyu.testserver.pattern.factory.factory.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
