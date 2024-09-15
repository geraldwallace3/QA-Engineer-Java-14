import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void array13() {
        int[][] array2x = new int[6][6];
        System.out.println(Arrays.deepToString(array2x));
        for (int i = 0; i < 6; i++) {
            array2x[i][i] = 1;
            array2x[i][6 - i - 1] = 1;
        }

        System.out.println(Arrays.deepToString(array2x));


    }

    public static void main(String[] args) {
        Main.array13();
    }
}


