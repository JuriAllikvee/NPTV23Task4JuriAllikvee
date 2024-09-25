import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50) * 2 + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d ", array[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        Arrays.sort(array);

        double average = Arrays.stream(array).average().orElse(0);

        System.out.println("\nSorted array:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%3d ", array[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.printf("\nAverage: %.2f\n", average);
    }
}