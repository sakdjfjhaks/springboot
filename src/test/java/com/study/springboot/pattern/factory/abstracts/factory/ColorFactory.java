package com.study.springboot.pattern.factory.abstracts.factory;

import com.maoqudiaoyu.testserver.pattern.factory.abstracts.color.Blue;
import com.maoqudiaoyu.testserver.pattern.factory.abstracts.color.Color;
import com.maoqudiaoyu.testserver.pattern.factory.abstracts.color.Green;
import com.maoqudiaoyu.testserver.pattern.factory.abstracts.color.Red;
import com.maoqudiaoyu.testserver.pattern.factory.abstracts.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }
}
