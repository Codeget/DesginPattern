package com.desginpattern.demo.decorator.Shape;

/**
 * Created by Administrator on 2017/3/31.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
