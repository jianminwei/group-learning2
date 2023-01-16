package grouplearning.corejava.basics.classes;
//Author: Matthew Wei
//Date: 1/16/23
//Class Description: Ancestor for Shape Class

public class Shape {
    // Define Shape ancestor class
    // Define specific shape (circle, square, etc.) sub-class


    private String nameOfShape;
    private int numberOfSides;
    private double area;
    private double perimeter;

    public Shape(String nameofShape, int numberOfSides, int area, int perimeter) {
        this.nameOfShape = nameofShape;
        this.numberOfSides = numberOfSides;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getNameOfShape() {
        return nameOfShape;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
