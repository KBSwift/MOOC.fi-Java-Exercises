
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> numberList = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        boolean positive = false;
        boolean negative = false;
        while (true) {
            String number = userInput.nextLine();
            if (number.equalsIgnoreCase("end")) {
                break;
            }
            numberList.add(number);
            if (Integer.valueOf(number) > 0) {
                positive = true;
            }
            if (Integer.valueOf(number) < 0) {
                negative = true;
            }
        }

        while (!(numberList.isEmpty())) {
            System.out.println("Print the averages of the negative numbers or the positive numbers?(n/p)");
            String response = userInput.nextLine();
            if (response.equalsIgnoreCase("p")) {
                if (numberList.isEmpty()) {
                    System.out.println("No numbers provided!");
                } else if (positive && negative || positive) {
                    double positiveAverage = numberList.stream()
                            .mapToInt(n -> Integer.valueOf(n))
                            .filter(n -> n > 0)
                            .average()
                            .getAsDouble();

                    System.out.println("Average of the positive numbers: " + positiveAverage);
                } else {
                    System.out.println("No positive numbers were given.");
                }
                break;
            }
            if (response.equalsIgnoreCase("n")) {
                if (numberList.isEmpty()) {
                    System.out.println("No numbers provided!");
                } else if (positive && negative || negative) {
                    double negativeAverage = numberList.stream()
                            .mapToInt(n -> Integer.valueOf(n))
                            .filter(n -> n < 0)
                            .average()
                            .getAsDouble();

                    System.out.println("Average of the negative numbers: " + negativeAverage);
                } else {
                    System.out.println("No negative numbers were given.");
                }
                break;
            }
        }

    }
}
