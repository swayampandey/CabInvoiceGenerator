package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InvoiceGeneratorTest {

    @Test
    public void givenDistanceAndTimeShouldReturnTotalFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.calculateFare(3.0,4);
        Assertions.assertEquals(30,fare);
    }
    @Test
    public void givenDistanceAndTimeShouldReturnMinFare(){
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double fare = invoiceGenerator.calculateFare(0.5,1);
        Assertions.assertEquals(4,fare);
    }


}
