package com.nchuy099;

import java.util.Scanner;

public class Discount {

    public double calculatePayment(boolean isVip,
                                          double order,
                                          boolean isUet) {
        if (order < 0 || order > 100) return -1;
        double payment = order;
        double discount = 0.0;
        if (isVip) {
            discount += 0.2;
        }
        if (order >= 1) {
            discount += 0.1;
        }
        if (isUet) {
            discount += 0.05;
        }
        payment = (1 - discount) * payment;
        return payment;
    }

}
