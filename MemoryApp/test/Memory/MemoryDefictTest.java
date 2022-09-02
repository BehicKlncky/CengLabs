/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Memory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author OEM
 */
public class MemoryDefictTest {
    
    public MemoryDefictTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of toString method, of class MemoryDefict.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        MemoryDefict instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeficitID method, of class MemoryDefict.
     */
    @Test
    public void testGetDeficitID() {
        System.out.println("getDeficitID");
        MemoryDefict instance = null;
        String expResult = "";
        String result = instance.getDeficitID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalDeficit method, of class MemoryDefict.
     */
    @Test
    public void testGetTotalDeficit() {
        System.out.println("getTotalDeficit");
        int expResult = 0;
        int result = MemoryDefict.getTotalDeficit();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class MemoryDefictImpl extends MemoryDefict {

        public MemoryDefictImpl() {
            super("", "");
        }
    }
    
}
