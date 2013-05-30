/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JPanel;
import org.jfree.chart.*;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * This class is responsible for displaying the chart for 
 * the "Player vs Country vs Overall" functionality in the 
 * "Single Player" tab.
 * @author attfire1
 */
public class PlayerVsCountryVsOverallChart extends JPanel
{
    private static final long serialVersionUID = 1L;
    private ArrayList<Player> players;
    private StatUtilities stats;
    public String yAxisLabel = "";
    private String chosenPlayer;
    public String[] compareStatsOptions = new String[] { "Average Balls Bowled", "Average of Bowling Averages", "Average Career Length", "Average Economy Rate", "Average Number of Five Wicket Innings", "Average Innings Played", "Average Matches Played", "Average Runs Conceded", "Average Strike Rate", "Average Wickets Taken" };
    ;
    
    /**
     * This constructor is responsible for producing the stats bar chart in 
     * the "Single Player Stats" tab in AppInterface.
     * @param applicationTitle
     * @param chartTitle
     * @param players The list of players to iterate through
     * @param option The option which determines what statistics to display
     * @param chosenPlayer The chosen player's name
     */
	public PlayerVsCountryVsOverallChart(String applicationTitle, String chartTitle, ArrayList<Player> players, int option, String chosenPlayer) {
        //super(applicationTitle);
        
        this.players = players;
        this.chosenPlayer = chosenPlayer;
        stats = new StatUtilities();

        final CategoryDataset dataset = createDataset(option, chosenPlayer);
        
        // based on the dataset we create the chart
        final JFreeChart chart = createChart(dataset, applicationTitle);
        
        // we put the chart into a panel
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(500, 270));

        // Don't forget me...
        setLayout(new BorderLayout());
        add(chartPanel); 
    }
    
    /**
     * This method returns the nth occurrence of a 
     * character in a given string.
     * 
     * Sourced from http://stackoverflow.com/questions/3976616/how-to-find-nth-occurrence-of-character-in-a-string.
     * @param str The string to get the index of a character from.
     * @param c The character to get the index of.
     * @param n What occurrence of character to retrieve.
     * @return The nth occurrence of a character.
     */
    public static int nthOccurrence(String str, char c, int n) {
        int pos = str.indexOf(c, 0);
        while (n-- > 0 && pos != -1)
            pos = str.indexOf(c, pos+1);
        return pos;
    }
        
    
    
/** * Creates a sample dataset */

    private  CategoryDataset createDataset(int graphDisplayOption, String playerChosen) {
        
        // row keys... "series"
        final String player = "Player";
        final String country = "Country";
        final String overall = "Overall";
        
        
        
        ArrayList<String> countries = new ArrayList<String>();
        for (Player p : players) {
            countries.add(p.getCountryName());
        }
        
        //these are also the "column keys"
        Set<String> countryNames = new HashSet<String>(countries);
        
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        /*
         * The below code block uses a switch statement to determine
         * which type of stats to display in the graph (country by country).
         * 
         * Options for the switch statement are as follows:
         * 
         * 1 = Average Balls Bowled
         * 2 = Average of Bowling Averages
         * 3 = Average Career Lengths
         * 4 = Average Economy Rates
         * 5 = Average Number of 5 Wicket Innings
         * 6 = Average Innings Played
         * 7 = Average Matches Played
         * 8 = Average Runs Conceded
         * 9 = Average Strike Rates
         * 10 = Average WicketsTaken
         */
        for(int i = 0; i < players.size(); i++)
        {
            //if the player's name in iteration i equals the chosen player's name
            if(players.get(i).getPlayerName().equals(playerChosen))
            {
            switch(graphDisplayOption)
                {
                    case 1:
                        yAxisLabel = compareStatsOptions[0];
                        dataset.addValue(players.get(i).getBallsBowled(), player, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveBallsBowled(players, players.get(i).getCountryName()), country, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveBallsBowled(players), overall, players.get(i).getPlayerName());
                        break;
                    case 2:
                        yAxisLabel = compareStatsOptions[1];
                        dataset.addValue(players.get(i).getBowlingAverage(), player, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveBowlingAverage(players, players.get(i).getCountryName()), country, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveBowlingAverage(players), overall, players.get(i).getPlayerName());
                        break;
                    case 3:
                        yAxisLabel = compareStatsOptions[2];
                        dataset.addValue(players.get(i).calcCareerSpan(), player, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveCareerLength(players, players.get(i).getCountryName()), country, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveCareerLength(players), overall, players.get(i).getPlayerName());
                        break;
                    case 4:
                        yAxisLabel = compareStatsOptions[3];
                        dataset.addValue(players.get(i).getEconomyRate(), player, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveEconRate(players, players.get(i).getCountryName()), country, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveEconRate(players), overall, players.get(i).getPlayerName());
                        break;
                    case 5:
                        yAxisLabel = compareStatsOptions[4];
                        dataset.addValue(players.get(i).getFiveWicketsInnings(), player, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveFiveWicketsInns(players, players.get(i).getCountryName()), country, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveFiveWicketsInns(players), overall, players.get(i).getPlayerName());
                        break;
                    case 6:
                        yAxisLabel = compareStatsOptions[5];
                        dataset.addValue(players.get(i).getInningsPlayed(), player, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveInningsPerCountry(players, players.get(i).getCountryName()), country, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveInningsPerPlayer(players), overall, players.get(i).getPlayerName());
                        break;
                    case 7:
                        yAxisLabel = compareStatsOptions[6];
                        dataset.addValue(players.get(i).getMatchesPlayed(), player, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveMatchesPerPlayer(players, players.get(i).getCountryName()), country, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveMatchesPerPlayer(players), overall, players.get(i).getPlayerName());
                        break;
                    case 8:
                        yAxisLabel = compareStatsOptions[7];
                        dataset.addValue(players.get(i).getRunsConceded(), player, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveRunsConceded(players, players.get(i).getCountryName()), country, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveRunsConceded(players), overall, players.get(i).getPlayerName());
                        break;
                    case 9:
                        yAxisLabel = compareStatsOptions[8];
                        dataset.addValue(players.get(i).getStrikeRate(), player, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveStrikeRate(players, players.get(i).getCountryName()), country, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveStrikeRate(players), overall, players.get(i).getPlayerName());
                        break;
                    case 10:
                        yAxisLabel = compareStatsOptions[9];
                        dataset.addValue(players.get(i).getWicketsTaken(), player, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveWickets(players, players.get(i).getCountryName()), country, players.get(i).getPlayerName());
                        dataset.addValue(stats.aveWickets(players), overall, players.get(i).getPlayerName());
                        break;
                }
        
        
            }
        }
        return dataset;
        
    }
    
    
/** * Creates a chart */

    private JFreeChart createChart(CategoryDataset dataset, String title) {
        
        // create the chart...
        final JFreeChart chart = ChartFactory.createBarChart(
            title,         // chart title
            "Countries",               // domain axis label
            yAxisLabel,                  // range axis label
            dataset,                  // data
            PlotOrientation.VERTICAL, // orientation
            true,                     // include legend
            true,                     // tooltips?
            false                     // URLs?
        );

        // NOW DO SOME OPTIONAL CUSTOMISATION OF THE CHART...

        // set the background color for the chart...
        chart.setBackgroundPaint(Color.white);

        // get a reference to the plot for further customisation...
        final CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(Color.lightGray);
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        // set the range axis to display integers only...
        final NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        // disable bar outlines...
        final BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        
        // set up gradient paints for series...
        final GradientPaint gp0 = new GradientPaint(
            0.0f, 0.0f, Color.blue, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp1 = new GradientPaint(
            0.0f, 0.0f, Color.green, 
            0.0f, 0.0f, Color.lightGray
        );
        final GradientPaint gp2 = new GradientPaint(
            0.0f, 0.0f, Color.red, 
            0.0f, 0.0f, Color.lightGray
        );
        renderer.setSeriesPaint(0, gp0);

        final CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        // OPTIONAL CUSTOMISATION COMPLETED.
        
        return chart;
        
    }
}