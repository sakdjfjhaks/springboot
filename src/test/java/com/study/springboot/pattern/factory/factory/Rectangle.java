package com.study.springboot.pattern.factory.factory;

import com.maoqudiaoyu.testserver.pattern.factory.factory.Shape;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}