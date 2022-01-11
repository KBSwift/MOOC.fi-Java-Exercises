
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<String> literacyData = returnFileAsList("literacy.csv");
        
        literacyData.stream()
                .map(gender -> gender.replace("(%)", ""))
                .map(row -> row.split(","))
                .sorted((p1, p2) -> {
                    return Double.compare(Double.valueOf(p1[5]), (Double.valueOf(p2[5])));
              }).forEach(p -> {
                  p[2] = p[2].trim();
                  p[5] = p[5].trim();
                  System.out.println(p[3] + " (" + p[4] + "), " + p[2] + ", " + p[5]);
              });

    }
    
    public static List<String> returnFileAsList(String fileName) {
        try {
            return Files.lines(Paths.get(fileName)).collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("Could not read file. See details below: \n" + e);
        }
        
        return new ArrayList<>();
    }
    
}
