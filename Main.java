import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void method7() {
        int a = ThreadLocalRandom.current().nextInt();
        boolean b1 = true;
        boolean b2 = false;
        if (a >= 0) {
            System.out.println(b2);
        } else System.out.println(b1);

    }

    public static void main(String[] args) {
        Main.method7();
    }
}