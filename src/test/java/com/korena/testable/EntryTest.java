package com.korena.testable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EntryTest {


    @Test
    public void helpTest(){
        assertEquals("help message", Entry.help());
    }

    @Test
    public void mainTest(){
        String[] args = new String[]{"test"};
        Entry.main(args);
        assertTrue(true);
    }

}
