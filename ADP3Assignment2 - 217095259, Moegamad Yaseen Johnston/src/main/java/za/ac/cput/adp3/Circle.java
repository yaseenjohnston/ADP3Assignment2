package za.ac.cput.adp3;

public class Circle {
    private double radius;

    //Constructor
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    //getters
    public double getRadius(){
        return radius;
    }
    public double getDiameter(){
        return (radius*2);
    }
    public double getCircumference(){
        return (2*radius*Math.PI);
    }
    public double getArea(){
        return (Math.PI*radius*radius);
    }

    //setters
    public void setRadius(double radius){
        this.radius = radius;
    }
}
