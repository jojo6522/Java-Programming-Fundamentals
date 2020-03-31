/*********************************************************************************
* (The Rectangle class) Following the example of the Circle class in Section 9.2,*
* design a class named Rectangle to represent a rectangle. The class contains:   *
*                                                                                *
* ■ Two double data fields named width and height that specify the width and     *
* height of the rectangle. The default values are 1 for both width and height.   *
* ■ A no-arg constructor that creates a default rectangle.                       *
* ■ A constructor that creates a rectangle with the specified width and height.  *
* ■ A method named getArea() that returns the area of this rectangle.            *
* ■ A method named getPerimeter() that returns the perimeter.                    *
*                                                                                *
* Draw the UML diagram for the class and then implement the class. Write a test  *
* program that creates two Rectangle objects—one with width 4 and height 40      *
* and the other with width 3.5 and height 35.9. Display the width, height, area, *
* and perimeter of each rectangle in this order.                                 *
*********************************************************************************/

public class Rectangle {
    public double height;
    public double width;

    public Rectangle()
    {
        width = 1;
        height= 1;
    }

    public Rectangle(double w, double h)
    {
        width = w;
        height = h;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return 2 * (width+height);
    }

}

public class Exercise9{
    public static void main(String[] args)
    {
       Rectangle r1 = new Rectangle(4,4);
       Rectangle r2 = new Rectangle(2, 2);

       System.out.println("The area of r1 is " + r1.getArea());
       System.out.println("The area of r2 is " + r2.getArea());
       System.out.println("The perimeter of r1 is " + r1.getPerimeter());
       System.out.println("The perimeter of r2 is " + r2.getPerimeter());

    }

}

