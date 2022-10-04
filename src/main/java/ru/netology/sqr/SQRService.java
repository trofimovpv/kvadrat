package ru.netology.sqr;


public class SQRService {
    public int calculate(int lowLimit, int highLimit) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            int ii = i * i;
            if (ii >= lowLimit) {
                if (ii <= highLimit) {
                    counter++;
                }
            }
        }
        return counter;
    }
}