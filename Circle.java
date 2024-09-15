public class Circle implements GeoShapes, Color, BorderColor {
    private double radius;
    private String color;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void printCharacteristics() {
        System.out.println("Круг");
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет: " + color);
        System.out.println("Цвет границы: " + borderColor);
    }
}
