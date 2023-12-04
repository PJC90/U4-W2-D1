import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = arrayCasuale();
        stampaArray(array);
    }


    private static int[] arrayCasuale() {
        int[] array = new int [5];
        Random rm = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rm.nextInt(100) + 1;
        }
        return array;
    }

    private static void stampaArray(int[] array) {
        System.out.println("Array numero:" + Arrays.toString(array));
    }
}