package com.praveen.samples.jacoco.multimodule;


import static org.junit.gen5.api.Assertions.assertEquals;


import org.junit.gen5.api.Test;


public class Module2ClassIntegrationTest {
    @Test
    public void testConvertFloatIntegrationTestTwo() {
        Module2Class module2Class = new Module2Class();
        assertEquals( 129f, module2Class.convertToFloat( 129));
    }
}
