package com.mycompany.twittertowers;


public abstract class TowerShape {
    protected int width;
    protected int height;

    public TowerShape(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public abstract double calcPerimeter();
}
