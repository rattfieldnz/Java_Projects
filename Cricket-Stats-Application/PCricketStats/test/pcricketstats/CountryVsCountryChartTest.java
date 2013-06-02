/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pcricketstats;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author interkiwiwebdev
 */
public class CountryVsCountryChartTest {
    
    public CountryVsCountryChartTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of nthOccurrence method, of class CountryVsCountryChart.
     */
    @Test
    public void testNthOccurrence() {
        System.out.println("nthOccurrence");
        String str = "";
        char c = ' ';
        int n = 0;
        int expResult = 0;
        int result = CountryVsCountryChart.nthOccurrence(str, c, n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}