import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void method9() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите год");
        int a = scr.nextInt();
        boolean b1 = true;
        boolean b2 = false;
        if ((a % 400 == 0) || (a % 400 % 100 != 0 && a % 400 % 4 == 0)) {
            System.out.println(b1);
        } else System.out.println(b2);

    }

    public static void main(String[] args) {
        Main.method9();
    }
}