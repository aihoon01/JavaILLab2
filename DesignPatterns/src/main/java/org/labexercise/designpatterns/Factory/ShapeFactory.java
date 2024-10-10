package org.labexercise.designpatterns.Factory;

public class ShapeFactory {

    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("Triangle")) {
            return new Triangle();
        }
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape("Rectangle");
        shape.make();
        System.out.println(shape);

        System.out.println("........");

        Shape shape2 = shapeFactory.createShape("Triangle");
        shape2.make();
        System.out.println(shape2);
    }
}