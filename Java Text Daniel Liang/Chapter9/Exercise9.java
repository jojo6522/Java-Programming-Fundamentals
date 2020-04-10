public class Main {

    public static void main(String[] args)
    {
        RegularPolygon r1, r2, r3;

        r1 = new  RegularPolygon();
        r2 = new RegularPolygon(8,6);
        r3 = new RegularPolygon(12,5,6.6,8.2);

        System.out.println(" The area of r1 is " + r1.getArea());
        System.out.println(" The area of r2 is " + r2.getArea());
        System.out.println(" The area of r3 is " + r3.getArea());
        System.out.println(" The perimeter of r1 is " + r1.getPerimeter());
        System.out.println(" The perimeter of r2 is " + r2.getPerimeter());
        System.out.println(" The perimeter of r1 is " + r1.getPerimeter());





    }
}

public class RegularPolygon {

    private int n =3;
    private double side =1;
    private double x=0;
    private double y=0;

    public RegularPolygon()
    {
        n=3;
        side=1;
        x=0;
        y=0;

    }

    public RegularPolygon(double length, int num)
    {
        n=num;
        side=length;
        x=0;
        y=0;

    }

    public RegularPolygon(double length, int num, double ex, double why)
    {
        n=num;
        side=length;
        x=ex;
        y=why;

    }

    public double getPerimeter()
    {
        return side*3;
    }

    public double getArea()
    {
        return side*side;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public double getY() {
        return y;
    }

    public double getSide() {
        return side;
    }

    public double getX() {
        return x;
    }
}
