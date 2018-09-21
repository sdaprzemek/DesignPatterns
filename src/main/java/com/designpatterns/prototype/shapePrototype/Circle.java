package com.designpatterns.prototype.shapePrototype;

public class Circle extends Shape {
    public int radius;

    public Circle() {

    }

    public Circle(Circle target) {
        super(target);
        if(target != null) {
            this.radius = target.radius;
        }
    }
    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle) || !super.equals(obj)) return false;
        Circle shape2 = (Circle) obj;
        return shape2.radius == radius;
    }
}
