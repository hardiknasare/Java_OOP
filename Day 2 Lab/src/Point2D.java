import java.math.*;

public class Point2D
{
    private int x, y;

    Point2D(int x, int y)
    {
        this.x=x;
        this.y=y;
    }   

    public String getDetails()
    {
        return "point " +x+ " " +y+" ";
    }

    public boolean isEqual(Point2D anotherPoint)
     {
         return this.x==anotherPoint.x && this.y==anotherPoint.y;
     }

    public Point2D offsetPoint(int x, int y)
     {
        Point2D newPoint=new Point2D(this.x+x, this.y+y);

        return new Point2D(this.x+x, this.y+y);
     }

    public double calculateDistance(Point2D anotherPoint)
     {
        double c=Math.sqrt((anotherPoint.x-this.x)*(anotherPoint.x-this.x)+(anotherPoint.y-this.y)*(anotherPoint.y-this.y));
        return c;
     }
}
