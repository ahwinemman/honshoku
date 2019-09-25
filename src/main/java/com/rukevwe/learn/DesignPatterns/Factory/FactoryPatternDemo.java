package com.rukevwe.learn.DesignPatterns.Factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        Shape shape = shapeFactory.getShape("CIRCLE");
        
        shape.draw();
    }
}
