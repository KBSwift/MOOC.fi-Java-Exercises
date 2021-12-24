
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
//        System.out.println("Paul: " + paulCard);
//        System.out.println("Matt: " + mattCard);
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);
        
        paulCard.eatHeartily();
        mattCard.eatAffordably();
        
        printBalances(paulCard, mattCard);

        paulCard.addMoney(20);
        mattCard.eatHeartily();
        
        printBalances(paulCard, mattCard);
        
        paulCard.eatAffordably();
        paulCard.eatAffordably();
        mattCard.addMoney(50);
        
        printBalances(paulCard, mattCard);
        
    }
    
    public static void printBalances(PaymentCard paulCard, PaymentCard mattCard) {
        System.out.println("Paul: " + paulCard);
        System.out.println("Matt: " + mattCard);
    }
}
