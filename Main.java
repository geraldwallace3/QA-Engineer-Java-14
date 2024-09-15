import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void method6() {
        int a = ThreadLocalRandom.current().nextInt();
        if (a>=0) {
            System.out.println("положительное");
        } else System.out.println("отрицательное");

    }

    public static void main(String[] args) {
        Main.method6();
    }
}