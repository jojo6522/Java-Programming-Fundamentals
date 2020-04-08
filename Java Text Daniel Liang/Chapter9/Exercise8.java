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
