package ru.netology.services;

public class BonusService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // Счётчик месяцев отдыха
        int money = 0; // Количество денег на счету
        
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Будем отдыхать
                money -= expenses;
                money -= money / 3;
                count++;
            } else {
                // Будем работать
                money += income;
                money -= expenses;
            }
        }
        
        return count;
    }
}
