import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void method8() {
        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        int a = scr.nextInt();
        int b = 0;
        while (b<a) {
            System.out.println(str);
            b++;
        }
    }

    public static void main(String[] args) {
        Main.method8();
    }
}