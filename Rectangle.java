public class Rectangle implements GeoShapes, Color, BorderColor {
    private double width;
    private double height;
    private String color;
    private String borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double perimeter() {
        return (width + height) * 2;
    }

    @Override
    public double area() {
        return width * height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public void printCharacteristics() {
        System.out.println("Прямоугольник");
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет: " + color);
        System.out.println("Цвет границы: " + borderColor);
    }
}
