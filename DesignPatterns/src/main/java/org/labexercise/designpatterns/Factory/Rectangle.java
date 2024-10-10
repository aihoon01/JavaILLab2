package org.labexercise.designpatterns.Factory;

public class Rectangle implements Shape {
    @Override
    public void make() {
        System.out.println("Making a Rectangle");
    }


    @Override
    public String toString() {
        return "Rectangle Created!";
    }
}
