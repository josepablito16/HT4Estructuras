/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ht4estructuras.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jose
 */
public class PruebasUnitarias {
    
    public void testMain() throws Exception {
        String linea = "1 2 + 4 * 3 +";
        String tipo = "3.2";
        Double expResult = 15.0;
        Calculadora calcu = Calculadora.getInstance();
        Double result = calcu.operar(linea, tipo);
        assertEquals(expResult,result,0.0);
    }
}
