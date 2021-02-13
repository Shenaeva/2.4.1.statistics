package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void calculaterSum() {
        int expected = 180;
        int actual = service.calculaterSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageSum() {
        int expected = 15;
        int actual = service.averageSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthMaxSale() {
        int expected = 8;
        int actual = service.monthMaxSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void monthMinSale() {
        int expected = 9;
        int actual = service.monthMinSale(sales);
        assertEquals(expected, actual);
    }

    @Test
    void sumMonthMinMean() {
        int expected = 5;
        int actual = service.sumMonthMinMean(sales);
        assertEquals(expected, actual);
    }

    @Test
    void sumMonthMaxMean() {
        int expected = 5;
        int actual = service.sumMonthMaxMean(sales);
        assertEquals(expected, actual);
    }
}