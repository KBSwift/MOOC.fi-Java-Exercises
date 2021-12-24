
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        MessagingService service = new MessagingService();
        Message message1 = new Message("Robert", "Hey buddy, good to see you.");
        
        Message message2 = new Message("Diane", "I cannot stand all of this and this will be a very long long long long long long long"
                + "long long long long overdue wall of text and if this service does not send you this message we are done and over for "
                + "ever and ever and ever and ever sahdlfksdlkfjalksjdfajlksdfjlakhdflshalsjdflkajsdflkjasdlkfjaljflajsdflkajdfljaslfj"
                + "aljdsfl;ajsdlfjalsjdfl;kajsdlfjasldjflaksjdfl;ja;ldjflakjsdfl;jaldfjaljdflkajidjaseiaeklfjajdlkajlkfsdjfjkejakljsdlfkja"
                + "ajlskdjfalejalkjdkjfalksjlek;jaflk;jdlafjsdlkfjal;kjsdfl;ajdslk;f");
        
        Message message3 = new Message("Rick", "Thanks for that great advice. Cheers.");
        
        service.add(message1);
        service.add(message2);
        service.add(message3);
        
        System.out.println(service.getMessages());
        
        
    }
}
