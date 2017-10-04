package com.korena.testable.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleCalcTest {

    private SimpleCalc simpleCalc = new SimpleCalc();


    @Test
    public void testOps(){
        int res = simpleCalc.operate('+', 5,5);
        assertEquals( 10, res);
        res = simpleCalc.operate('-', 5,5);
        assertEquals(0, res);
        res = simpleCalc.operate('x', 5,5);
        assertEquals(25, res);;
        res = simpleCalc.operate('/', 5,5);
        assertEquals(1, res);
    }


    @Test
    public void testAdd(){
        assertEquals(5, simpleCalc.add(1,4));
    }


    @Test
    public void testSub(){
        assertEquals(5, simpleCalc.sub(6,1));
    }

    @Test
    public void testMultiply(){
        assertEquals(5, simpleCalc.mult(5,1));
    }

    @Test
    public void testDiv(){
        assertEquals(5, simpleCalc.div(5,1));
    }
}
