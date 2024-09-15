import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void checkSumSign() {
        int a = ThreadLocalRandom.current().nextInt(-10, 10);
        int b = ThreadLocalRandom.current().nextInt(-10, 10);
        System.out.println(a);
        System.out.println(b);
        int res = a + b;
        if (res >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {
        Main.checkSumSign();
    }
}