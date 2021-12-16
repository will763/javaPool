package com.example;

public abstract class Shape {
     private int width;

    public abstract void area();

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
