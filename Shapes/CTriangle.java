package Shapes;

public class CTriangle extends CShape {
    private double a;
    private double b;
    private double c;
    
    public CTriangle(double a, double b, double c, String colour) {
        this.a = a;
        this.b = b;
        this.c = c;
        
        area = a * b * 0.5;
        this.colour = colour;
    }
    
    @Override
    public double recalculateArea() {
        area = a * b * 0.5;
        return area;
    }
}
