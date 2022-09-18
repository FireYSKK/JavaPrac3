public class Circle extends Shape{
    protected double radius;

    public Circle() {}

    public Circle(double radius){
        this.setRadius(radius);
    }

    public Circle(double radius, String color, boolean isFilled){
        super(color, isFilled);
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        if (isFilled){
            return "Filled "+super.getColor()+" circle with radius "+this.radius;
        }
        else {
            return "Circle with "+super.getColor()+" border with radius"+this.radius;
        }
    }
}
