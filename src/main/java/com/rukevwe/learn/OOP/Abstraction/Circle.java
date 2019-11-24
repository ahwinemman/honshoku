package com.rukevwe.learn.OOP.Abstraction;

public class Circle extends AbstractShape implements Shape {
    
    @Override
    public void display() {
        System.out.println("This is a circle");
    }
}
