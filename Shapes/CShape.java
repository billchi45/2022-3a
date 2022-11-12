package Shapes;

/**
 *
 * @author billtsoi
 */
public abstract class CShape {    
    protected double area;
    protected String colour;
    
    public abstract double recalculateArea();
    
    public double getArea() {
        return area;
    }
    
    public String getColour() {
        return colour;
    }
}
