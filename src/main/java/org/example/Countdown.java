package org.example;


public class Countdown {
//    Напишите программу, которая выводит на экран «5,4,3,2,1» используяцикл for.

    void countBack(int countdownNumber) {
        System.out.println("\n5. Напишите программу, которая выводит на экран «5,4,3,2,1» используяцикл for.");
        int count = countdownNumber;
        for (int i = 0; i < countdownNumber; i++) {
            System.out.println(count--);
        }
    }
}
