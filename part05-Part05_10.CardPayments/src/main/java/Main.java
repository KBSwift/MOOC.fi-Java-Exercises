
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        PaymentTerminal uniCafe = new PaymentTerminal();
        System.out.println(uniCafe);

        PaymentCard annesCard = new PaymentCard(2);
        
        System.out.println("Amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = uniCafe.eatHeartily(annesCard);
        System.out.println("There was enough money: " + wasSuccessful);
        
        uniCafe.addMoneyToCard(annesCard, 100);
        
        wasSuccessful = uniCafe.eatHeartily(annesCard);
        System.out.println("There was enough money: " + wasSuccessful);
        
        System.out.println("Amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(uniCafe);
    }
}
