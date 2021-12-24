
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        return squares > compared.squares;
    }
    
    public int priceDifference(Apartment compared) {
        int difference = (squares * pricePerSquare) - compared.squares * compared.pricePerSquare;
        if (difference > 0) {
            return difference;
        }
        return difference * -1;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        return (squares * pricePerSquare) > (compared.squares * compared.pricePerSquare);
    }
}
