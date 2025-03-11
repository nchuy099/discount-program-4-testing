package com.nchuy099;

import org.junit.Assert;
import org.junit.Test;

public class DiscountTest {

    @Test
    public void testId1() {
        Discount discount = new Discount();
        Assert.assertEquals(-1.0, discount.calculatePayment(true, -5, true), 0.001);

    }

    @Test
    public void testId2() {
        Discount discount = new Discount();
        Assert.assertEquals(-1.0, discount.calculatePayment(true, -5, true), 0.001);

    }

    @Test
    public void testId3() {
        Discount discount = new Discount();
        Assert.assertEquals(6.5, discount.calculatePayment(true, 10, true), 0.001);

    }
}
