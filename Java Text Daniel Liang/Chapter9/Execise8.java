/* 

Jordon Johnson
04/07/20


JAVA - (The Fan class ) Design a class  named Fan to represent a fan. The class contains:
■ Three constants  named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to
denote the fan speed. The Fan class
VideoNote
M08_LIAN6521_09_SE_C08.qxd 2/2/12 10:21 PM Page 331
332 Chapter 8 Objects and Classes
■ A private  int data field named speed that specifies the speed of the fan (the
default is SLOW).
■ A private  boolean data field named on that specifies whether the fan is on (the
default is false ).
■ A private  double data field named radius that specifies the radius of the fan
(the default is 5).
■ A string data field named color that specifies the color of the fan (the default
is blue).
■ The accessor and mutator methods for all four data fields.
■ A no-arg constructor that creates a default fan.
■ A method  named toString() that returns a string description for the fan. If
the fan is on, the method returns the fan speed, color, and radius in one combined
string . If the fan is not on, the method returns the fan color and radius
along with the string “fan is off” in one combined string .
Draw the UML diagram for the class and then implement the class . Write a test
program that creates two Fan objects . Assign maximum speed, radius 10, color
yellow, and turn it on to the first object . Assign medium speed, radius 5, color
blue, and turn it off to the second object . Display the objects by invoking their
toString method . */

public class Fan {

    //final variables
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int FAST = 3;

    //class variables
    private int speed;
    private boolean on;
    private String color;
    private double radius;

    //default constructor
    public Fan()
    {
        speed = SLOW;
        on= false;
        color = "blue" ;
        radius= 5;
    }

    public Fan(int sp, boolean o, String co,  double r)
    {
        speed = sp;
        on = o;
        color = co;
        radius = r;

    }

    // getter methods

    public int getSpeed()
    {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    //setter methods


    public void setOn(boolean on) {
        this.on = on;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // toString method

    public String toString()
    {
        if (isOn())
        {
            return "The fan's speed, color and radius is, " + this.getSpeed() + " " + this.getColor() + " " + this.getRadius();
        }else {
            return "This fan is off" ;
        }
    }

    public static void main(String[] args)
    {
        Fan f1 = new Fan(FAST,true, "red", 6);
        Fan f2 = new Fan(MEDIUM,false, "red", 6) ;

        System.out.println(f1);
        System.out.println(f2);
    }



}
