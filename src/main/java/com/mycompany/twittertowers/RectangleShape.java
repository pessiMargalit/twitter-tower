package com.mycompany.twittertowers;

class RectangleShape extends TowerShape {

    public RectangleShape(int width, int height) {
        super(width, height);
    }

    public double calcArea() {
        return width * height;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (width + height);   
    }   
}
