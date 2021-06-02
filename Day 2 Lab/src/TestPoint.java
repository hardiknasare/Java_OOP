import java.util.*;
public class TestPoint
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter coordinates of point p1: ");
        Point2D p1=new Point2D(input.nextInt(), input.nextInt());
        System.out.print("Enter coordinates of point p2: ");
        Point2D p2=new Point2D(input.nextInt(), input.nextInt());
        System.out.println();

        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());
        System.out.println();

        System.out.println("Both points are : ");
        System.out.println(p1.isEqual(p2)?"Same":"Different");
        System.out.println();

        System.out.print("Enter offset value from p1: ");
        Point2D p3=p1.offsetPoint(input.nextInt(),input.nextInt());
        System.out.println(p3.getDetails());
        System.out.println();

        System.out.print("The distance between two points are: ");
        System.out.println(p1.calculateDistance(p2));
        System.out.println();

    }
}