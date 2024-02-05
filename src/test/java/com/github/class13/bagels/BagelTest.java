package com.github.class13.bagels;

import org.junit.Assert;
import org.junit.Test;

public class BagelTest {

    @Test
    public void testBagel() {
        Bagel bagel = BagelSolver.getBagel();

        Assert.assertEquals(
                bagel.getValue() == 4,
                Boolean.TRUE
        );
    }
}
