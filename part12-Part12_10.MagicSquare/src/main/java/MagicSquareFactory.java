
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int y = 0;
        int x = 0;
        for (int i = 1; i <= square.getWidth() * square.getHeight(); i++) {

            if (square.getWidth() == 3 && i == 1) {
                y = square.getWidth() % 2;
                square.placeValue(x, y, i);
                continue;
            } else if (i == 1) {
                y = square.getWidth() / 2;
                square.placeValue(x, y, i);
                continue;
            }

            if (y == square.getWidth() - 1 && x == 0) {
                if (square.readValue(square.getWidth() - 1, 0) == -1) {
                    y = 0;
                    x = square.getWidth() - 1;
                    square.placeValue(x, y, i);
                    continue;
                }
                x += 1;
                square.placeValue(x, y, i);
                continue;
            }

            if (x == 0) {
                y += 1;
                x = square.getHeight() - 1;
                square.placeValue(x, y, i);
                continue;
            }

            if (y == square.getWidth() - 1) {
                y = 0;
                x -= 1;
                square.placeValue(x, y, i);
                continue;
            }

            if (square.readValue(x - 1, y + 1) == 0) {
                x -= 1;
                y += 1;
                square.placeValue(x, y, i);
                continue;
            } 
            
            x += 1;
            square.placeValue(x, y, i);

        }

        return square;
    }

}
