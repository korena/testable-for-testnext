package com.korena.testable;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EntryTest {


    @Test
    public void helpTest(){
        assertEquals("help message", Entry.help());
    }


}
