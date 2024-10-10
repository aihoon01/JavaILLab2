package org.labexercise.designpatterns.Factory;

public class Triangle implements Shape {
    @Override
    public void make() {
        System.out.println("Making a Triangle");
    }

    @Override
    public String toString() {
        return "Triangle Created!";
    }
}
