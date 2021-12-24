
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        /*
        int spaceCounter = size;
        int starsCounter = 1;
        while (spaceCounter > 0) {
            printSpaces(spaceCounter - 1);
            printStars(starsCounter);
            spaceCounter--;
            starsCounter++;
        }
        */
        //int starsCounter = 1;
        for (int i = size; i > 0; i--) {
            printSpaces(i - 1);
            printStars(size - i + 1);
            //starsCounter++;
        }
        
        //iteration 0: size = 4 i = 4 starsCounter = 1
        //iteration 1: size = 4 i = 3 starsCounter = 2
        //iteration 2: size = 4 i = 2 starsCounter = 3
        //iteration 3: size = 4 i = 1 starsCounter = 4
        
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        
        int stars = 1;
        for (int i = height; i > 0; i--) {
            printSpaces(i - 1);
            printStars(stars);
            stars += 2;
        }
        
        printSpaces(stars / 2 - 2);
        printStars(3);
        printSpaces(stars / 2 - 2);
        printStars(3);
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        //printSpaces(1);
        //printSpaces(1);
        //printSpaces(1);
        //printSpaces(1);
        //printStars(5);
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
