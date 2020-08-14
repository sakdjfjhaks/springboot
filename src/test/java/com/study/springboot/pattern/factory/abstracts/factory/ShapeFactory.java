package com.study.springboot.pattern.factory.abstracts.factory;

import com.maoqudiaoyu.testserver.pattern.factory.abstracts.color.Color;
import com.maoqudiaoyu.testserver.pattern.factory.abstracts.shape.Circle;
import com.maoqudiaoyu.testserver.pattern.factory.abstracts.shape.Rectangle;
import com.maoqudiaoyu.testserver.pattern.factory.abstracts.shape.Shape;
import com.maoqudiaoyu.testserver.pattern.factory.abstracts.shape.Square;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}
