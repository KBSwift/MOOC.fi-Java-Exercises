
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        
        Money a = new Money(10, 0);
        Money b = new Money(5, 50);
        
        System.out.println(a);
        Money c = a.plus(b);
        System.out.println(a + "\n" + b + "\n" + c);
        
        System.out.println(a.lessThan(c));
        
        a = a.minus(b);
        System.out.println(a);
    }
}
