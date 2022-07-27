
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int smallestIdx = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        // write your  here
        int smallest = array[startIndex];
        int smallestIdx = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIdx = i;
            }
        }
        return smallestIdx;
    }

    public static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int num = indexOfSmallestFrom(array, i);
            swap(array, i, num);
        }
    }
}
