package ru.netology.stats;

public class StatsService {
    //сумма всех продаж
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //средняя сумма продаж
    public float averageSalesAmount(int[] sales) {
        return (float) sumAllSales( sales ) / (float) sales.length;
    }

    //номер месяца максимальных продаж
    public int maxSales(int[] sales) {
        int maxSale = 0;
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                month = i + 1;
                maxSale = sales[i];
            }
        }
        return month;
    }

    // номер месяца минимальных продаж
    public int minSales(int[] sales) {
        int minSale = sales[0];
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                month = i + 1;
                minSale = sales[i];
            }
        }
        return month;
    }


    //количество месяцев, в которых продажи были ниже среднего
    public int numberOfMonthSaleBelowAvg(int[] sales) {
        int number = 0;
        float avg = averageSalesAmount( sales );
        for (int i = 0; i < sales.length; i++) {
            if ((float) sales[i] < avg) {
                number = number + 1;
            }
        }
        return number;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int numberOfMonthAboveAvg(int[] sales) {
        int number = 0;
        float avg = averageSalesAmount( sales );
        for (int i = 0; i < sales.length; i++) {
            if ((float) sales[i] > avg) {
                number = number + 1;
            }
        }
        return number;
    }

}