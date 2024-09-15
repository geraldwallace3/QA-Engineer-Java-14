import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void printColor() {
        int value = ThreadLocalRandom.current().nextInt(-100, 200);
        System.out.println(value);
        if ((value > 0) && (value <= 100)) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
        if (value <= 0) {
            System.out.println("Красный");
        }
    }

    public static void main(String[] args) {
        Main.printColor();
    }
}