
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // insert test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        String[] array2 = {"bob", "catherine", "xavier", "tim", "bryan"};
        System.out.println(Arrays.toString(array2));
        sort(array2);
        System.out.println(Arrays.toString(array2));
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        
        strings.add("hellen");
        strings.add("joyce");
        strings.add("eric");
        strings.add("bob");
        strings.add("heather");
        strings.add("bryan");
        
        integers.add(5);
        integers.add(52);
        integers.add(7);
        integers.add(1);
        integers.add(69);
        integers.add(105);
        integers.add(6);
        
        System.out.println(strings.toString());
        System.out.println(integers.toString());
        sortStrings(strings);
        sortIntegers(integers);
        System.out.println(strings.toString());
        System.out.println(integers.toString());
        
        
        
    }

    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    public static void sort(String[] array) {
        Arrays.sort(array);
    }
    
    public static void sortIntegers(ArrayList<Integer> integers) {
        Collections.sort(integers);
    }
    
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }

}
