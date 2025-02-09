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
 * @since 09/02/2025
 * @author Nereida Rodríguez Orenes 1ºDAM
 * Práctica de testing; esta clase se crea con Junit4 al clicar botón derecho en la clase a testear > Tools > Create/Update test
 */
public class classToTestTest {
    
    public classToTestTest() {
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
     * Test of multiplica method, of class classToTest.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = 2;
        int b = 2;
        classToTest instance = new classToTest();
        int expResult = 4;
        int result = instance.multiplica(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of factorial method, of class classToTest.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int numero = 5;
        classToTest instance = new classToTest();
        int expResult = 120;
        int result = instance.factorial(numero);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of factorial method, performance.
     */
    @Test (timeout=1000)
    public void testFactorialTimeout(){
        System.out.println("factorial con timeout");
        int numero = 300;
        classToTest instance = new classToTest();
        int result = instance.factorial(numero);
    }
}
