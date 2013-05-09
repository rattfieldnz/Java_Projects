/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

/**
 * The Player class, which is responsible for the creation of 
 * each player.
 * 
 * @author Rob Attfield
 */
public class Player {
    
    private String playerName, countryName, careerSpan;
    private int matchesPlayed,inningsPlayed, ballsBowled, runsConceded, wicketsTaken, fiveWicketsInnings;
    private double bowlingAverage, economyRate, strikeRate;
    
    /**
     * The main constructor for the Player class - which is used to create 
     * a player from each row in the CSV file.
     * @param playerName The player's full name.
     * @param countryName The country which the player plays for.
     * @param careerSpan The years during which the player played (formatted like "1988-2006").
     * @param matchesPlayed The number of matches played by the player.
     * @param inningsPlayed The number of innings played by the player.
     * @param ballsBowled The number of balls bowled by the player.
     * @param runsConceded The amount of runs conceded by the player.
     * @param wicketsTaken How many wickets the player has taken.
     * @param bowlingAverage The player's bowling average.
     * @param economyRate The player's bowling economy rate.
     * @param strikeRate The player's bowling strike rate (runs conceded per wicket taken).
     * @param fiveWicketsInnings The number of innings where the player has taken 5 wickets.
     */
    public Player(String playerName, String countryName, String careerSpan, int matchesPlayed, 
            int inningsPlayed, int ballsBowled, int runsConceded, int wicketsTaken, 
            double bowlingAverage, double economyRate, double strikeRate, int fiveWicketsInnings)
    {
        setPlayerName(playerName);
        setCountryName(countryName);
        setCareerSpan(careerSpan);
        setMatchesPlayed(matchesPlayed);
        setInningsPlayed(inningsPlayed);
        setBallsBowled(ballsBowled);
        setRunsConceded(runsConceded);
        setWicketsTaken(wicketsTaken);
        setBowlingAverage(bowlingAverage);
        setEconomyRate(economyRate);
        setStrikeRate(strikeRate);
        setFiveWicketsInnings(fiveWicketsInnings);
    }
    
    /**
     * The method which sets the players name
     * @param playerName 
     */
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
    
    /**
     * The method which returns the players name.
     * @return The players name.
     */
    public String getPlayerName()
    {
        return this.playerName;
    }
    
    /**
     * The method which sets the country name, 
     * who a player plays for.
     * @param countryName The country's name.
     */
    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }
    
    /**
     * The method which returns the country name.
     * @return The country name, which a player plays for.
     */
    public String getCountryName()
    {
        return this.countryName;
    }
    
    /**
     * The method which sets the players career span.
     * @param careerSpan The player's career span.
     */
    public void setCareerSpan(String careerSpan)
    {
        this.careerSpan = careerSpan;
    }
    
    /**
     * The method that gets the player's career span, 
     * used for calculating the player's career length.
     * 
     * @return The player's career span.
     */
    public String getCareerSpan()
    {
        return this.careerSpan;
    }
    
    /**
     * The method which sets the number of matches played, 
     * by a player.
     * 
     * @param matchesPlayed The number of matches played by the player.
     */
    public void setMatchesPlayed(int matchesPlayed)
    {
        this.matchesPlayed = matchesPlayed;
    }
    
    /**
     * The method that returns the player's career span.
     * 
     * @return The player's carer span.
     */
    public int getMatchesPlayed()
    {
        return this.matchesPlayed;
    }
    
    /**
     * The method that sets the number of innings played 
     * by a player.
     * 
     * @param inningsPlayed The number of innings played by a player.
     */
    public void setInningsPlayed(int inningsPlayed)
    {
        this.inningsPlayed = inningsPlayed;
    }
    
    /**
     * The method that returns the number of innings played 
     * by a player.
     * 
     * @return The number of innings played by the player.
     */
    public int getInningsPlayed()
    {
        return this.inningsPlayed;
    }
    
    /**
     * The method that sets the number of balls bowled 
     * by a player.
     * 
     * @param ballsBowled The number of balls bowled by a player.
     */
    public void setBallsBowled(int ballsBowled)
    {
        this.ballsBowled = ballsBowled;
    }
    
    /**
     * The method that returns the number of balls bowled 
     * by a player. 
     * 
     * @return The number of balls bowled by a player.
     */
    public int getBallsBowled()
    {
        return this.ballsBowled;
    }
    
    /**
     * The method that sets the runs conceded by a player.
     * 
     * @param runsConceded The number of runs conceded by the player.
     */
    public void setRunsConceded(int runsConceded)
    {
        this.runsConceded = runsConceded;
    }
    
    /**
     * The method that returns the number of runs conceded 
     * by a player.
     * 
     * @return The number of runs conceded by a player.
     */
    public int getRunsConceded()
    {
        return this.runsConceded;
    }
    
    /**
     * The method that sets the number of wickets taken 
     * by a player.
     * 
     * @param wicketsTaken The number of wickets taken by a player.
     */
    public void setWicketsTaken(int wicketsTaken)
    {
        this.wicketsTaken = wicketsTaken;
    }
    
    /**
     * The method that returns the number of wickets taken 
     * by a player.
     * 
     * @return The number of wickets taken by a player.
     */
    public int getWicketsTaken()
    {
        return this.wicketsTaken;
    }
    
    /**
     * The method that sets the bowling average for 
     * a player.
     * 
     * @param bowlingAverage The player's bowling average.
     */
    public void setBowlingAverage(double bowlingAverage)
    {
        this.bowlingAverage = bowlingAverage;
    }
    
    /**
     * The method that returns the player's bowling average.
     * 
     * @return The player's bowling average.
     */
    public double getBowlingAverage()
    {
        return this.bowlingAverage;
    }
    
    /**
     * The method that sets the player's bowling economy rate.
     * 
     * @param economyRate The player's bowling economy rate.
     */
    public void setEconomyRate(double economyRate)
    {
        this.economyRate = economyRate;
    }
    
    /**
     * The method that gets the player's bowling 
     * economy rate. 
     * 
     * @return The player's bowling economy rate.
     */
    public double getEconomyRate()
    {
        return this.economyRate;
    }
    
    /**
     * The method that sets the player's bowling strike rate.
     * 
     * @param strikeRate The player's bowling strike rate.
     */
    public void setStrikeRate(double strikeRate)
    {
        this.strikeRate = strikeRate;
    }
    
    /**
     * The method that gets the player's bowling 
     * strike rate.
     * 
     * @return The player's strike rate.
     */
    public double getStrikeRate()
    {
        return this.strikeRate;
    }
    
    /**
     * The method that sets the number of innings where 
     * a player has taken 5 wickets.
     * 
     * @param fiveWicketsInnings The number of innings where the player has taken 5 wickets.
     */
    public void setFiveWicketsInnings(int fiveWicketsInnings)
    {
        this.fiveWicketsInnings = fiveWicketsInnings;
    }
    
    /**
     * The method that gets the number of innings where 
     * a player has taken 5 wickets.
     * 
     * @return The number of innings where a player has taken 5 wickets.
     */
    public int getFiveWicketsInnings()
    {
        return this.fiveWicketsInnings;
    }
    
    /**
     * This method calculates how long a player played for, in years - This uses the player's career span.
     * 
     * @return The length of a player's career, in years.
     */
    public int calcCareerSpan()
    {
        //if length of careerSpan is greater than 4
        if(this.careerSpan.length() > 4)
        {
        //Split careerSpan into two variables, 
        //obtaining the startYear and endYear of
        //the players career.
        String[] years = this.careerSpan.split("-");
        
            //Check if both of the year variables are 4 characters in length.
            //If they are, convert them into integers, and assign them 
            //sensible names. Then return the length of the players career, by
            //subtracting the startDate from the endDate.
            if(years[0].length() == 4 && years[1].length() == 4)
            {
                int startYear = Integer.parseInt(years[0]);
                int endYear = Integer.parseInt(years[1]);

                return endYear - startYear;
            }
            //If either variable's length is not equal to 4, 
            //throw an exception with an appropriate warning.
            else
            {
                throw new ArithmeticException("Data in 'Span' column of CSV file must be formatted like '1987-2006'");
            }
        }
        //If the careerSpan has a length of 4, 
        //check to see if any of the string characters 
        //contains a delimiter. If not, return 1 - else
        //throw an exception with the appropriate warning.
        else if(careerSpan.length() == 4)
        {
            if(!careerSpan.contains("-"))
            {
                return 1;
            }
            else
            {
                throw new ArithmeticException("Data in 'Span' column of CSV file must be formatted like '1987-2006'");
            }
        }
        //If careerLength is less than 4, 
        //throw an exception with the 
        //appropriate warning.
        else if(careerSpan.length() < 4)
        {
            throw new ArithmeticException("Data in 'Span' column of CSV file must be formatted like '1987-2006'");
        }
        
        else
        {
            throw new ArithmeticException("Data in 'Span' column of CSV file must be formatted like '1987-2006'");
        }
    }
    
    /**
     * The custom toString method, that returns each players details.
     * 
     * @return The details for a player.
     */
    @Override
    public String toString()
    {
        return getPlayerName() + " | " + getCountryName() + " | Career Span: " + calcCareerSpan() + " years | " 
                + getMatchesPlayed() + " | " + getInningsPlayed() + " | " + getBallsBowled() + " | " 
                + getRunsConceded() + " | " + getWicketsTaken() + " | " + getBowlingAverage() + " | " 
                + getEconomyRate() + " | " + getStrikeRate() + " | " + getFiveWicketsInnings();
    }
}
