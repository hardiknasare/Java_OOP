package com.tester;
import com.geomtry.*;
import java.util.*;
public class TestPoint
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coordinates of point p1: ");
        Point2D p1=new Point2D(sc.nextInt(), sc.nextInt());
        System.out.println("Enter coordinates of point p2: ");
        Point2D p2=new Point2D(sc.nextInt(), sc.nextInt());
        System.out.println("----------------------------------");

        System.out.println(p1.getDetails());
        System.out.println(p2.getDetails());
        System.out.println("----------------------------------");

        System.out.print("Both points are : ");
        System.out.println(p1.isEqual(p2)?"Same":"Different");
        System.out.println("----------------------------------");

        System.out.println("Enter offset value from p1: ");
        Point2D p3=p1.offsetPoint(sc.nextInt(),sc.nextInt());
        System.out.println(p3.getDetails());
        System.out.println("----------------------------------");

        System.out.print("The distance between two oints are: ");
        System.out.println(p1.calculateDistance(p2));
        System.out.println("----------------------------------");

    }
}
