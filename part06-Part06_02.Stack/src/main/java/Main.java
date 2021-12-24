
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack stack = new Stack();
        
        stack.add("first");
        stack.add("second");
        stack.add("third");
        
        System.out.println(stack.values());

        while (!stack.isEmpty()) {
            System.out.println(stack.take());
        }
    }
}
