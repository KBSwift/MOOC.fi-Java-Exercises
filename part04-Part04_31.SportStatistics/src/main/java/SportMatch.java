/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kavin
 */
public class SportMatch {

    private String homeTeam;
    private String visitingTeam;
    private int homePoints;
    private int visitingPoints;

    public SportMatch(String homeTeam, String visitingTeam, int homePoints, int visitingPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homePoints = homePoints;
        this.visitingPoints = visitingPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitingTeam() {
        return visitingTeam;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public int getVisitingPoints() {
        return visitingPoints;
    }

    public boolean includesTeam(String team) {
        return team.equalsIgnoreCase(homeTeam) || team.equalsIgnoreCase(visitingTeam);
    }
    
    public String winningTeam() {
        if (homePoints > visitingPoints) {
            return homeTeam;
        } else {
            return visitingTeam;
        }
    }
    
}
