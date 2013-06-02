/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This class is a utilities class, which is responsible for: 
 * reading in player information from a CSV file, 
 * 
 * @author Rob Attfield
 */
public class ReadInStats {
    private String playerName, countryName, careerSpan;
    private int playerID, matchesPlayed,inningsPlayed, ballsBowled, runsConceded, wicketsTaken, fiveWicketsInnings;
    private double bowlingAverage, economyRate, strikeRate;

    /**
     * This method loads player information from a CSV file.
     * 
     * @param players The ArrayList where each player will be loaded into, from each row of the CSV file.
     */
    public void load(ArrayList<Player> players) {
        BufferedReader in;

        String line;
        try {
            in = new BufferedReader(new FileReader("CricketBowlingStats.csv"));
            in.readLine();
            while ((line = in.readLine()) != null) {
                
                
                String[] fields = line.split(",");
                this.playerID = Integer.parseInt(fields[0]);
                this.playerName = fields[1];
                this.countryName = fields[2];
                this.careerSpan = fields[3];
                this.matchesPlayed = Integer.parseInt(fields[4]);
                this.inningsPlayed = Integer.parseInt(fields[5]);
                this.ballsBowled = Integer.parseInt(fields[6]);
                this.runsConceded = Integer.parseInt(fields[7]);
                this.wicketsTaken = Integer.parseInt(fields[8]);
                this.bowlingAverage = Double.parseDouble(fields[9]);
                this.economyRate = Double.parseDouble(fields[10]);
                this.strikeRate = Double.parseDouble(fields[11]);
                this.fiveWicketsInnings = Integer.parseInt(fields[12]);
                
                players.add(new Player(playerID, playerName, countryName, careerSpan, matchesPlayed, 
                        inningsPlayed, ballsBowled, runsConceded, wicketsTaken, bowlingAverage, 
                        economyRate, strikeRate, fiveWicketsInnings));

            }

        }
        catch (IOException e) {
            System.out.println("There was a problem with the file. \nAlso, make sure the file is in the project root directory.");
            e.printStackTrace();
        } 
    }
}
