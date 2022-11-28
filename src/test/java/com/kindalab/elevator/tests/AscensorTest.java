
package com.kindalab.elevator.tests;

import com.kindalab.elevator.entities.Ascensor;
import com.kindalab.elevator.entities.AscensorPublico;
import com.kindalab.elevator.entities.Keycard;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AscensorTest {
    
    private final Ascensor ascensorCarga = new Ascensor();
    private final AscensorPublico ascensorPublico = new AscensorPublico();
    
    public AscensorTest() {
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


    @Test
    public void testPuedeIrAlPiso() {
        
        System.out.println("=== TEST ASCENSOR CARGA ===");

        assertEquals(true, ascensorCarga.puedeIrAlPiso(4, 1000));
        assertEquals(true, ascensorCarga.puedeIrAlPiso(-1, 2000));
        assertEquals(true, ascensorCarga.puedeIrAlPiso(50, 3000));
        assertEquals(false, ascensorCarga.puedeIrAlPiso(4, 8500));

        System.out.println("=== TEST ASCENSOR PUBLICO ===");

        assertEquals(true, ascensorPublico.puedeIrAlPiso(4, 800, null));
        assertEquals(true, ascensorPublico.puedeIrAlPiso(-1, 900, new Keycard(123456)));
        assertEquals(true, ascensorPublico.puedeIrAlPiso(50, 1000, new Keycard(123456)));
        assertEquals(false, ascensorPublico.puedeIrAlPiso(-1, 1000, null));
        assertEquals(false, ascensorPublico.puedeIrAlPiso(-1, 5000, new Keycard(123456)));
        assertEquals(false, ascensorPublico.puedeIrAlPiso(-1, 5000, null));
        assertEquals(false, ascensorPublico.puedeIrAlPiso(50, 1000, null));
        assertEquals(false, ascensorPublico.puedeIrAlPiso(50, 5000, new Keycard(123456)));
        assertEquals(false, ascensorPublico.puedeIrAlPiso(50, 5000, null));

    }

    
}
