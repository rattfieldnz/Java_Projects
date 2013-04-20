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
    private int matchesPlayed,inningsPlayed, ballsBowled, runsConceded, wicketsTaken, fiveWicketsInnings;
    private double bowlingAverage, economyRate, strikeRate;

    /**
     * This method loads player information from a CSV file.
     * 
     * @param players The ArrayList where each player will be loaded into, from each row of the CSV file.
     * @throws IOException - This exception is thrown if there is an issue with the CSV file.
     * The CSV file must be formatted like the one included with this project.
     */
    public void load(ArrayList<Player> players) {
        BufferedReader in;

        String line;
        try {
            in = new BufferedReader(new FileReader("CricketBowlingStats.csv"));
            in.readLine();
            while ((line = in.readLine()) != null) {
                
                
                String[] fields = line.split(",");
                
                this.playerName = fields[0];
                this.countryName = fields[1];
                this.careerSpan = fields[2];
                this.matchesPlayed = Integer.parseInt(fields[3]);
                this.inningsPlayed = Integer.parseInt(fields[4]);
                this.ballsBowled = Integer.parseInt(fields[5]);
                this.runsConceded = Integer.parseInt(fields[6]);
                this.wicketsTaken = Integer.parseInt(fields[7]);
                this.bowlingAverage = Double.parseDouble(fields[8]);
                this.economyRate = Double.parseDouble(fields[9]);
                this.strikeRate = Double.parseDouble(fields[10]);
                this.fiveWicketsInnings = Integer.parseInt(fields[11]);
                
                players.add(new Player(playerName, countryName, careerSpan, matchesPlayed, 
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
