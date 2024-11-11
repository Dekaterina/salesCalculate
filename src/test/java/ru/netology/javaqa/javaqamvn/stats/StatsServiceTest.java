package ru.netology.javaqa.javaqamvn.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSumAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.сalculateSumAllSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.сalculateAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.getMonthMaxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMonthMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.getMonthMinSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthBellowAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.countMontsBellowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCountMonthAboveAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.countMontsBellowAverageSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
