package com.desginpattern.demo.facade.Shape;

/**
 * Created by Administrator on 2017/3/31.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}