/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

/**
 *
 * @author attfire1
 */
public class Player {
    
    private String playerName, countryName, careerSpan;
    private int matchesPlayed,inningsPlayed, ballsBowled, runsConceded, wicketsTaken, fiveWicketsInnings;
    private double bowlingAverage, economyRate, strikeRate;
    
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
    
    //Get and set for playerName
    public void setPlayerName(String playerName)
    {
        this.playerName = playerName;
    }
    
    public String getPlayerName()
    {
        return this.playerName;
    }
    
    //Get and set for countryName
    public void setCountryName(String countryName)
    {
        this.countryName = countryName;
    }
    
    public String getCountryName()
    {
        return this.countryName;
    }
    
    //Get and set for careerSpan
    public void setCareerSpan(String careerSpan)
    {
        this.careerSpan = careerSpan;
    }
    
    public String getCareerSpan()
    {
        return this.careerSpan;
    }
    
    //Get amd set for matchesPlayed
    public void setMatchesPlayed(int matchesPlayed)
    {
        this.matchesPlayed = matchesPlayed;
    }
    
    public int getMatchesPlayed()
    {
        return this.matchesPlayed;
    }
    
    //Get and set for inningsPlayed
    public void setInningsPlayed(int inningsPlayed)
    {
        this.inningsPlayed = inningsPlayed;
    }
    
    public int getInningsPlayed()
    {
        return this.inningsPlayed;
    }
    
    //Get and set for ballsBowled
    public void setBallsBowled(int ballsBowled)
    {
        this.ballsBowled = ballsBowled;
    }
    
    public int getBallsBowled()
    {
        return this.ballsBowled;
    }
    
    //Get an set for runsConceded
    public void setRunsConceded(int runsConceded)
    {
        this.runsConceded = runsConceded;
    }
    
    public int getRunsConceded()
    {
        return this.runsConceded;
    }
    
    //Get and set for wicketsTaken
    public void setWicketsTaken(int wicketsTaken)
    {
        this.wicketsTaken = wicketsTaken;
    }
    
    public int getWicketsTaken()
    {
        return this.wicketsTaken;
    }
    
    //get and set for bowlingAverage
    public void setBowlingAverage(double bowlingAverage)
    {
        this.bowlingAverage = bowlingAverage;
    }
    
    public double getBowlingAverage()
    {
        return this.bowlingAverage;
    }
    
    //Get and set for economyRate
    public void setEconomyRate(double economyRate)
    {
        this.economyRate = economyRate;
    }
    
    public double getEconomyRate()
    {
        return this.economyRate;
    }
    
    //Get and set for strikeRate
    public void setStrikeRate(double strikeRate)
    {
        this.strikeRate = strikeRate;
    }
    
    public double getStrikeRate()
    {
        return this.strikeRate;
    }
    
    //Get and set for fiveWicketsInnings
    public void setFiveWicketsInnings(int fiveWicketsInnings)
    {
        this.fiveWicketsInnings = fiveWicketsInnings;
    }
    
    public int getFiveWicketsInnings()
    {
        return this.fiveWicketsInnings;
    }
    
    //method to obtain length of players career from 
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
    
    @Override
    public String toString()
    {
        return getPlayerName() + " | " + getCountryName() + " | Career Span: " + calcCareerSpan() + " years | " 
                + getMatchesPlayed() + " | " + getInningsPlayed() + " | " + getBallsBowled() + " | " 
                + getRunsConceded() + " | " + getWicketsTaken() + " | " + getBowlingAverage() + " | " 
                + getEconomyRate() + " | " + getStrikeRate() + " | " + getFiveWicketsInnings();
    }
}
