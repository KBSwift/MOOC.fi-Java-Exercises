
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        
        while (true) {
            String person = scanner.nextLine();
            if (person.equals("")) {
                break;
            }
            
            String[] namePart = person.split(",");
            names.add(namePart[0]);
            ages.add(Integer.valueOf(namePart[1]));
        }
        
        String longest = names.get(0);
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        
        int sumOfAges = 0;
        for (int age : ages) {
            sumOfAges += age;
        }
        
        System.out.println("Longest name: " + longest);
        System.out.println("Average of the birth years: " + ( (double) sumOfAges / ages.size()));
        
//        String longestName = "";
//        int sumOfYears = 0;
//        int counter = 0;
//        while (true) {
//            String person = scanner.nextLine();
//            if (person.equals("")) {
//                break;
//            }
//            
//            String[] parts = person.split(",");
//            String name = parts[0];
//            sumOfYears += Integer.valueOf(parts[1]);
//            counter++;
//            if (name.length() > longestName.length()) {
//                longestName = name;
//            }
//        }
//        
//        System.out.println("Longest name: " + longestName);
//        System.out.println("Average of the birth years: " + ( (double) sumOfYears / counter));
    }
}
