import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void array10() {
        int[] array = {1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 - array[i];
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Main.array10();
    }
}