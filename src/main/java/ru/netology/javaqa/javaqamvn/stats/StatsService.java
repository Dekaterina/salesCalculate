package ru.netology.javaqa.javaqamvn.stats;

public class StatsService {

    public long сalculateSumAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long сalculateAverageSales(long[] sales) {
        return сalculateSumAllSales(sales) / sales.length;
    }

    public int getMonthMaxSales(long[] sales) {
        int monthMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMax] <= sales[i]) {
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    public int getMonthMinSales(long[] sales) {
        int monthMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[monthMin] >= sales[i]) {
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    public int countMontsBellowAverageSales(long[] sales) {
        int count = 0;
        long averageSales = сalculateAverageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                count++;
            }
        }
        return count;
    }

    public int countMontsAboveAverageSales(long[] sales) {
        int count = 0;
        long averageSales = сalculateAverageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                count++;
            }
        }
        return count;
    }
}





