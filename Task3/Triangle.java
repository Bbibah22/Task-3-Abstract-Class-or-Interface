public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        super("Triangle");
        this.a = a; this.b = b; this.c = c;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    @Override
    public double perimeter() { return a + b + c; }

    @Override
    public void draw() { System.out.println("Drawing a triangle with sides " + a + ", " + b + ", " + c); }
}