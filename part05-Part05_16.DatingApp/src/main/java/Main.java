
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate originalDate = new SimpleDate(30, 9, 2015);
        System.out.println("The examined day is " + originalDate);
        
        SimpleDate newDate = originalDate.afterNumberOfDays(1);
        System.out.println(newDate);
    }
}
