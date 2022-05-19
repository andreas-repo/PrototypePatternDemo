package org.demo.model.impl;

import org.demo.model.Shape;

public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }

    @Override
    protected void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
