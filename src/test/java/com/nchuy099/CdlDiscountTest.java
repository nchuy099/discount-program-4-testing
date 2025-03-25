package com.nchuy099;

import org.junit.Assert;
import org.junit.Test;

public class CdlDiscountTest {

    @Test
    public void testId1() {
        Discount discount = new Discount();
        Assert.assertEquals(0.4, discount.calculatePayment(true, 0.5, false), 0.001);

    }

    @Test
    public void testId2() {
        Discount discount = new Discount();
        Assert.assertEquals(0.5, discount.calculatePayment(false, 0.5, false), 0.001);

    }

    @Test
    public void testId3() {
        Discount discount = new Discount();
        Assert.assertEquals(-1, discount.calculatePayment(true, -5, true), 0.001);

    }

    @Test
    public void testId4() {
        Discount discount = new Discount();
        Assert.assertEquals(45, discount.calculatePayment(false, 50, false), 0.001);

    }

    @Test
    public void testId5() {
        Discount discount = new Discount();
        Assert.assertEquals(0.475, discount.calculatePayment(false, 0.5, true), 0.001);

    }

    @Test
    public void testId6() {
        Discount discount = new Discount();
        Assert.assertEquals(35, discount.calculatePayment(true, 50, false), 0.001);

    }

    @Test
    public void testId7() {
        Discount discount = new Discount();
        Assert.assertEquals(0.375, discount.calculatePayment(true, 0.5, true), 0.001);

    }

    @Test
    public void testId8() {
        Discount discount = new Discount();
        Assert.assertEquals(42.5, discount.calculatePayment(false, 50, true), 0.001);

    }


}
