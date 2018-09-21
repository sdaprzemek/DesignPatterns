package com.designpatterns.prototype.shapePrototype;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.radius = 15;
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.height = 10;
        rectangle.width = 20;
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for(Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if(shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different");
                if(shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": Shapes are identical");
                } else {
                    System.out.println(i + ": Shapes are not identical");
                }
            } else {
                System.out.println(i + ": Shapes objects are the same");
            }
        }
    }
}
