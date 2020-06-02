
package Geometry;
import java.lang.Math;

public class Triangle {
    Point point;
    Point point1;
    Point point2;

    public Triangle(Point point, Point point1, Point point2) {
        this.point = point;
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint() {
        return point;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }


}
