package com.study.springboot.pattern.factory.abstracts.factory;

import com.maoqudiaoyu.testserver.pattern.factory.abstracts.color.Color;
import com.maoqudiaoyu.testserver.pattern.factory.abstracts.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
