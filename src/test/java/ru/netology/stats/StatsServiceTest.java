package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void checkSumAllSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.sumAllSales( sales );
        Assertions.assertEquals( expected, actual );
    }

    @Test
    public void checkAverageSalesAmount() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        float expected = 15;
        float actual = service.averageSalesAmount( sales );
        Assertions.assertEquals( expected, actual );
    }

    @Test
    public void checkMaxSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales( sales );
        Assertions.assertEquals( expected, actual );
    }

    @Test
    public void checkMinSales() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales( sales );
        Assertions.assertEquals( expected, actual );
    }

    @Test
    public void checkNumOfMonthSalBelowAvg() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.numberOfMonthSaleBelowAvg( sales );
        Assertions.assertEquals( expected, actual );
    }

    @Test
    public void checkNumOfSalAboveAvg() {
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.numberOfMonthAboveAvg( sales );
        Assertions.assertEquals( expected, actual );
    }
}
