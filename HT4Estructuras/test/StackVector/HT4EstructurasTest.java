/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackVector;

import ht4estructuras.Calculadora;
import ht4estructuras.HT4Estructuras;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JUMPSTONIK
 */
public class HT4EstructurasTest {
    
    public HT4EstructurasTest() {
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
     * Test of main method, of class HT4Estructuras.
     */
    @Test
    public void testMain() throws Exception {
        String linea = "1 2 + 4 * 3 +";
        String tipo = "2";
        Double expResult = 15.0;
        Calculadora calcu = Calculadora.getInstance();
        Double result = calcu.operar(linea, tipo);
        assertEquals(expResult,result,0.0);
    }
    
}
