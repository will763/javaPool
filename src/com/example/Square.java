package com.example;

public class Square extends Shape{

    Square(int x){
        setWidth(x);
    }

    @Override
    public void area() {
        System.out.println(getWidth()*getWidth());
    }
}
