/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package testingPackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Asus
 */
public class fahrenheitCelsiusTest {
    
    public fahrenheitCelsiusTest() {
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
     * Test of FtoC method, of class fahrenheitCelsius.
     */
    @Test
    public void testFtoC() {
        System.out.println("FtoC");
        float F = 32.0F;
        fahrenheitCelsius instance = new fahrenheitCelsius();
        float expResult = 0.0F;
        float result = instance.FtoC(F);
        assertEquals(expResult, result, 0);
    }

    /**
     * Test of CtoF method, of class fahrenheitCelsius.
     */
    @Test
    public void testCtoF() {
        System.out.println("CtoF");
        float C = 32F;
        fahrenheitCelsius instance = new fahrenheitCelsius();
        float expResult = 89.6F;
        float result = instance.CtoF(C);
        assertEquals(expResult, result, 0);
    }
    
}
