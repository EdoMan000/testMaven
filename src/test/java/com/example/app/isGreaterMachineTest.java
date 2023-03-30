package com.example.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for isGreaterMachine.
 */
public class isGreaterMachineTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        boolean res = false;
        try {
            res = isGreaterMachine.isGreater(4, 3);
        } catch (sameNumberException e) {
            e.printStackTrace();
        }; 
        assertTrue( res );
    }
}
