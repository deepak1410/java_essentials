package com.dpk.problems.companies.aspectcap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PriceHolderTest {

    private PriceHolder priceHolder;

    @BeforeEach
    void setUp() {
        priceHolder = new PriceHolder();
    }

    @Test
    void testPutAndGetPrice() {
        priceHolder.putPrice("a", BigDecimal.valueOf(100));
        BigDecimal val = priceHolder.getPrice("a");
        assertEquals(BigDecimal.valueOf(100), val);
    }

    @Test
    void testHasPriceChangedValue() {
        priceHolder.putPrice("a", BigDecimal.valueOf(100));
        assertTrue(priceHolder.hasPriceChanged("a"));

        priceHolder.putPrice("a", BigDecimal.valueOf(200));
        assertTrue(priceHolder.hasPriceChanged("a"));

        priceHolder.getPrice("a");
        assertFalse(priceHolder.hasPriceChanged("a"));

        priceHolder.putPrice("a", BigDecimal.valueOf(300));
        assertTrue(priceHolder.hasPriceChanged("a"));

        priceHolder.getPrice("a");
        assertFalse(priceHolder.hasPriceChanged("a"));
    }

    @Test
    void testHasPriceChangedValueInParallel() throws InterruptedException {
        // Threads to update data
        Thread thread1 = new Thread(() -> priceHolder.putPrice("a", BigDecimal.valueOf(100)));
        Thread thread2 = new Thread(() -> priceHolder.putPrice("a", BigDecimal.valueOf(200)));
        Thread thread3 = new Thread(() -> priceHolder.putPrice("a", BigDecimal.valueOf(300)));

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        priceHolder.getPrice("a");
        assertFalse(priceHolder.hasPriceChanged("a"));

        thread3.start();
        thread3.join();
        assertTrue(priceHolder.hasPriceChanged("a"));
        assertEquals(BigDecimal.valueOf(300), priceHolder.getPrice("a"));
    }

}