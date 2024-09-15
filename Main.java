import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void method5() {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        int sum = a+b;
        boolean b1 = true;
        boolean b2 = false;
        if ((sum>=10)&&(sum<=20)) {
            System.out.println(b1);
        } else System.out.println(b2);

    }

    public static void main(String[] args) {
        Main.method5();
    }
}