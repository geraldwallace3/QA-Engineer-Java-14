public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        circle.setColor("Оранжевый");
        circle.setBorderColor("Зеленый");
        circle.printCharacteristics();

        Rectangle rectangle = new Rectangle(3,4);
        rectangle.setColor("Белый");
        rectangle.setBorderColor("Черный");
        rectangle.printCharacteristics();

        Triangle triangle = new Triangle(9,4,6);
        triangle.setColor("Синий");
        triangle.setBorderColor("Серый");
        triangle.printCharacteristics();
    }
}