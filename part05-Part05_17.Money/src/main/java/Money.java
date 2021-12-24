
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int addedEuros = addition.euros();
        int addedCents = addition.cents();
        Money newMoney = new Money(euros + addedEuros, cents + addedCents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (euros < compared.euros) {
            return true;
        }
        
        return euros == compared.euros && cents < compared.cents;
    }
    
//    public boolean equals(Money compared) {
//        if (this == compared) {
//            return true;
//        }
//        
//        if (!(compared instanceof Money)) {
//            return false;
//        }
//        
//        return true;
//    }
    
    public Money minus(Money decreaser) {
        int decreasedEuros = (euros() - decreaser.euros()) * 100;
        int decreasedCents = cents() - decreaser.cents();
        int differenceValue = decreasedEuros + decreasedCents;
        Money newMoney = new Money(0, differenceValue);
        Money zeroBalance = new Money(0, 0);
        
        if (differenceValue <= 0) {
            return zeroBalance;
        }
        
        return newMoney;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
