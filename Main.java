import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void compareNumbers() {
        int a = ThreadLocalRandom.current().nextInt();
        System.out.println(a);
        int b = ThreadLocalRandom.current().nextInt();
        System.out.println(b);
        if (a>=b) {
            System.out.println("a>=b");
        }
        else System.out.println("a<b");

    }

    public static void main(String[] args) {
        Main.compareNumbers();
    }
}