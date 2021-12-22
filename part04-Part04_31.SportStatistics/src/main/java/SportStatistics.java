
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("File:");
        String fileRequested = userInput.nextLine();
        System.out.println("Team:");
        String teamRequested = userInput.nextLine();
        
        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesLost = 0;
        ArrayList<SportMatch> records = matchRecords(fileRequested);
        for (SportMatch match : records) {
            if (match.includesTeam(teamRequested)) {
                if (teamRequested.equalsIgnoreCase(match.winningTeam())) {
                    gamesWon++;
                } else {
                    gamesLost++;
                }
                gamesPlayed++;
            }
            
        }
        
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLost);
        
        
    }

    public static ArrayList<SportMatch> matchRecords(String file) {
        ArrayList<SportMatch> sportMatch = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homePoints = Integer.valueOf(parts[2]);
                int visitingPoints = Integer.valueOf(parts[3]);
                
                sportMatch.add(new SportMatch(homeTeam, visitingTeam, homePoints, visitingPoints));
            }
            
        } catch (Exception e) {
            System.out.println("File " + file + " was not found. See below \n" + e);
        }
        
        return sportMatch;
    } 
}
