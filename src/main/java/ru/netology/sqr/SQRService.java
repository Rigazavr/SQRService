package ru.netology.sqr;

public class SQRService {
    public int rootEnumerate(int min, int max) {
        int rootNumber = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square <= max) rootNumber = rootNumber + 1;
        }
        return rootNumber;
    }
}
