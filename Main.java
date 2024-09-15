import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void array14() {
        Scanner scr = new Scanner(System.in);
        int len = scr.nextInt();
        int initialValue = scr.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Main.array14();
    }
}