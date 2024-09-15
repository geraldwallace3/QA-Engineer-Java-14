public class Triangle implements GeoShapes, Color, BorderColor {
    private double sideA;
    private double sideB;
    private double sideC;
    private String borderColor;
    private String color;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public double area() {
        double halfPer = perimeter()/2;
        return Math.sqrt(halfPer*(halfPer-sideA)*(halfPer-sideB)*(halfPer-sideC));
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    public void printCharacteristics() {
        System.out.println("Треугольник");
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет: " + color);
        System.out.println("Цвет границы: " + borderColor);
    }
}
