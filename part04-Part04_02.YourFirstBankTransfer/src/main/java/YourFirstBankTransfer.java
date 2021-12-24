
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        
        Account mattAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);
        
        mattAccount.withdrawal(100.00);
        myAccount.deposit(100.00);
        
        System.out.println(mattAccount);
        System.out.println(myAccount);
    }
}
