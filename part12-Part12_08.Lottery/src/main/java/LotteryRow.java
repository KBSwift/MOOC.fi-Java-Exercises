
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        for (int i = 0; i < 7 ; i++) {
            int randomNum = new Random().nextInt(40) + 1;
            while (this.containsNumber(randomNum)) {
                randomNum = new Random().nextInt(40) + 1;
            }
            numbers.add(randomNum);
        }
        // Implement the random number generation here
        // the method containsNumber is probably useful
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        if (numbers.contains(number)) {
            return true;
        }
        return false;
    }
}
