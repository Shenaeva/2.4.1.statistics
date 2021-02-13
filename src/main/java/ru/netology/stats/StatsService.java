package ru.netology.stats;

public class StatsService {
    public int calculaterSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum / sales.length;
    }

    public int monthMaxSale(int[] sales) {
        int i = 0;
        int month = 0;
        int currentMax = sales[0];
        for (int sale : sales) {
            i++;
            if (currentMax <= sale){
                currentMax = sale;
                month = i;
            }
        }
        return month;
    }
    public int monthMinSale(int[] sales) {
        int y = 0;
        int month = 0;
        int currentMin = sales[0];
        for (int sale : sales) {
            y++;
            if (currentMin > sale){
                currentMin = sale;
                month = y;
            }
        }
        return month;
    }

    public int sumMonthMinMean(int[] sales) {
        int sumMonth = 0;
        int debuceMonth = calculaterSum(sales)/sales.length;
        for (int sale : sales) {
            if (debuceMonth > sale){
                sumMonth++;
            }
        }
        return sumMonth;
    }

    public int sumMonthMaxMean(int[] sales) {
        int sumMonth = 0;
        int debuceMonth = calculaterSum(sales)/sales.length;
        for (int sale : sales) {
            if (debuceMonth < sale){
                sumMonth++;
            }
        }
        return sumMonth;
    }

}