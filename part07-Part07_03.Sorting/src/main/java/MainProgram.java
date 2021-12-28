
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 4, 12, 20};
        sort(array);
//        System.out.println(smallest(array));
//        System.out.println(indexOfSmallest(array));
//        System.out.println(indexOfSmallestFrom(array, 2));
//        System.out.println(Arrays.toString(array));
//        swap(array, 2, 7);
//        System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int indexOfSmallest = 0;
        int index = 0;
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
                indexOfSmallest = index;
            }
            index++;
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int holdingVar = array[index1];
        array[index1] = array[index2];
        array[index2] = holdingVar;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallest = indexOfSmallestFrom(array, i);
            swap(array, smallest, i);
        }
    }

}
