import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }
            
            System.out.print("Duration: ");
            int showDuration = Integer.valueOf(scanner.nextLine());
            
            programs.add(new TelevisionProgram(showName, showDuration));
        }
        
        System.out.println();
        System.out.print("Program's maximum duration? ");
        int requestedDuration = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= requestedDuration) {
                System.out.println(program);
            }
        }
        
    }
}
