
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        
//        MagicSquareFactory msFactory = new MagicSquareFactory();
//        System.out.println(msFactory.createMagicSquare(5));

        MagicSquare test = new MagicSquare(2);
        test.placeValue(0, 0, 1);
        test.placeValue(1, 0, 10);
        test.placeValue(0, 1, 3);
        test.placeValue(1, 1, 4);

        System.out.println(test);
        System.out.println(test.sumsOfDiagonals());
    }
}
