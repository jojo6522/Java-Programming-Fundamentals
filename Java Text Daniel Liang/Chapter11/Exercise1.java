import java.util.Date;

public class GeometricObject {
    private String colour = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String colour, boolean filled){
        dateCreated = new java.util.Date();
        this.colour = colour;
        this.filled = filled;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\ncolour" + colour + " and filled " + filled;
    }
}

//Triangle Class

public class Triangle extends GeometricObject {

    private double side1, side2, side3;

    public Triangle(){
        super();
        side1=1;
        side2=1;
        side3=1;
    }

    public Triangle(double one, double two, double three, String colour, boolean filled){
        super(colour,filled);

        side1=one;
        side2=two;
        side3=three;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea()
    {
        return side1 * side2;
    }

    public double getPerimeter()
    {
        return side1+side2+side3;
    }

    public String toString()
    {

        return " The sides of the triangle are " + this.getSide1() +  " " +this.getSide2() + " " + this.getSide3()
                + " \n the area and perimeter is " + this.getArea() + " " + this.getPerimeter() + super.toString();


    }

    public static void main(String[] args)
    {
        //super("green", true);
        Triangle t1 = new Triangle(15,13,25, "green", true );
        System.out.println(t1);


    }




}




