package com.desginpattern.demo.decorator.Shape;

/**
 * Created by Administrator on 2017/3/31.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
