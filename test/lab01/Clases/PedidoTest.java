/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01.Clases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author martin
 */
public class PedidoTest {
    
    public PedidoTest() {
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
     * Test of getId method, of class Pedido.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Pedido instance = new Pedido(1, 12345, 125.00, estados.PREPARACION);
        int expResult = 1;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Pedido.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 1;
        Pedido instance = new Pedido(1, 12345, 125.00, estados.PREPARACION);
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFecha method, of class Pedido.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Pedido instance = new Pedido(1, 12345, 125.00, estados.PREPARACION);
        int expResult = 12345;
        int result = instance.getFecha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setFecha method, of class Pedido.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        int fecha = 12345;
        Pedido instance = new Pedido(1, 12345, 125.00, estados.PREPARACION);
        instance.setFecha(fecha);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecio_total method, of class Pedido.
     */
    @Test
    public void testGetPrecio_total() {
        System.out.println("getPrecio_total");
        Pedido instance = new Pedido(1, 12345, 125.00, estados.PREPARACION);
        double expResult = 125.0;
        double result = instance.getPrecio_total();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecio_total method, of class Pedido.
     */
    @Test
    public void testSetPrecio_total() {
        System.out.println("setPrecio_total");
        double precio_total = 125.0;
        Pedido instance = new Pedido(1, 12345, 125.00, estados.PREPARACION);
        instance.setPrecio_total(precio_total);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Pedido.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Pedido instance = new Pedido(1, 12345, 125.00, estados.PREPARACION);
        estados expResult = estados.PREPARACION;
        estados result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Pedido.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        estados estado = estados.PREPARACION;
        Pedido instance = new Pedido(1, 12345, 125.00, estados.PREPARACION);
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDataPedido method, of class Pedido.
     */
    @Test
    public void testGetDataPedido() {
        System.out.println("getDataPedido");
        Pedido instance = new Pedido(1, 12345, 125.00, estados.PREPARACION);
        DataPedido expResult = null;
        DataPedido result = instance.getDataPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}