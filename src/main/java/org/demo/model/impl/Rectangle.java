package org.demo.model.impl;

import org.demo.model.Shape;

public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
