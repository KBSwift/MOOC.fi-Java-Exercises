
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // Test your method here
//        int rows = 2;
//        int columns = 3;
//        int[][] matrix = new int[rows][columns];
//        matrix[0][1] = 5;
//        matrix[1][0] = 3;
//        matrix[1][2] = 7;
//        System.out.println(arrayAsString(matrix));

        int[][] matrix = {
            {3, 2, 7, 6}, //0,0
            {2, 4, 1, 0}, //1,1
            {3, 2, 1, 0}, //2,2
            {1, 8, 6, 5}
        };

        System.out.println(sumsOfDiagonal(matrix));
    }

    public static String arrayAsString(int[][] array) {

        StringBuilder rows = new StringBuilder();
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                int value = array[row][column];
                rows.append(value);
            }
            rows.append("\n");
        }
        return rows.toString();
    }

    public static ArrayList<Integer> sumsOfDiagonal(int[][] square) {
        ArrayList<Integer> sums = new ArrayList<>();
        
        int sum1 = 0;
        int sum2 = 0;
        for (int row = 0; row < square.length; row++) {
            sum1 += square[row][row];
        }
        for (int row = square.length - 1; row > 0; row--) {
            sum2 += square[row][row];
        }
        sums.add(sum1);
        sums.add(sum2);

        
        return sums;
    }

}
