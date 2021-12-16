package com.example;

import static java.lang.Math.PI;

public class Circle extends Shape{

    Circle(int x){
        setWidth(x);
    }

    @Override
    public void area() {
        System.out.println((double) PI*getWidth()*getWidth());
    }
}
