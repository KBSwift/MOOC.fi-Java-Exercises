
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();
        
        try (Scanner personScanner = new Scanner(Paths.get(fileName))) {
            while (personScanner.hasNextLine()) {
                String line = personScanner.nextLine();
                
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                if (!(age == 1)) {
                    System.out.println(name + ", age: " + age + " years");
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }
            }
        } catch (Exception e) {
            System.out.println("File " + fileName + " was not found." + "See below: \n" + e);
        }
    }
}
