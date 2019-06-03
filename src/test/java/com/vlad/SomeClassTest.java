package com.vlad;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeClassTest {

    @Test(timeout = 50)
    public void shouldReturnTwoWhenSomeClassReturnsTwo(){
        assertEquals("We want to see 2",2, SomeClass.getTwo());
    }

    @Test
    public void shouldFail() {
        fail("Done");
    }
}