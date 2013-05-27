/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author attfire1
 */
public class CountryVsCountryChart extends JFrame
{
    private static final long serialVersionUID = 1L;
    private ArrayList<Player> players;
    private String country;
    private StatUtilities stats;

	public CountryVsCountryChart(String applicationTitle, String chartTitle, ArrayList<Player> players, int option) {
        super(applicationTitle);
        
        this.players = players;
        stats = new StatUtilities();
        
        // This will create the dataset 
        PieDataset dataset = createDataset(option);
        // based on the dataset we create the chart
        JFreeChart chart = createChart(dataset, chartTitle);
        // we put the chart into a panel
        ChartPanel chartPanel = new ChartPanel(chart);
        // default size
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        // add it to our application
        setContentPane(chartPanel);
}
        
    
    
/** * Creates a sample dataset */

    private  PieDataset createDataset(int graphDisplayOption) {
        
        ArrayList<String> countries = new ArrayList<String>();
        for (Player p : players) {
            countries.add(p.getCountryName());
        }
        
        Set<String> countryNames = new HashSet<String>(countries);
        
        DefaultPieDataset result = new DefaultPieDataset();
        
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
        for(String c: countryNames)
        {
            switch(graphDisplayOption)
            {
                case 1:
                    result.setValue(c, stats.aveBallsBowled(players, c));
                    break;
                case 2:
                    result.setValue(c, stats.aveBowlingAverage(players, c));
                    break;
                case 3:
                    result.setValue(c, stats.aveCareerLength(players, c));
                    break;
                case 4:
                    result.setValue(c, stats.aveEconRate(players, c));
                    break;
                case 5:
                    result.setValue(c, stats.aveFiveWicketsInns(players, c));
                    break;
                case 6:
                    result.setValue(c, stats.aveInningsPerCountry(players, c));
                    break;
                case 7:
                    result.setValue(c, stats.aveMatchesPerPlayer(players, c));
                    break;
                case 8:
                    result.setValue(c, stats.aveRunsConceded(players, c));
                    break;
                case 9:
                    result.setValue(c, stats.aveStrikeRate(players, c));
                    break;
                case 10:
                    result.setValue(c, stats.aveWickets(players, c));
                    break;
            }
        }
        
        return result;
        
    }
    
    
/** * Creates a chart */

    private JFreeChart createChart(PieDataset dataset, String title) {
        
        JFreeChart chart = ChartFactory.createPieChart3D(
            title,  				// chart title
            dataset,                // data
            true,                   // include legend
            true,
            false
        );

        PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
        
    }
}
