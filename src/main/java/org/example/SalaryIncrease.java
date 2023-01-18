package org.example;

import java.time.LocalDate;

public class SalaryIncrease {
//    Написать программу,которая увеличивает зарплату каждый месяц на $1000

    int salary = 0;
    LocalDate today = LocalDate.now();

    void printAllCyclesMethods(int numberMonths) {
        System.out.println("3. Написать программу,которая увеличивает зарплату каждый месяц на $1000");
        System.out.println("Сегодня " + today + ", моя ЗП  = " + salary + "$");
        increaseSalaryFor(numberMonths);
        increaseSalaryWhile(numberMonths);
        increaseSalaryDoWhile(numberMonths);
        System.out.println();
    }

    private void increaseSalaryFor(int numberMonths) {
        System.out.println("\n Увеличение ЗП с использованием for");
        int newSalary = salary;
        LocalDate newDate = today;

        for (int i = 0; i < numberMonths; i++) {
            newSalary += 1000;
            newDate = newDate.plusMonths(1);
            System.out.println("В этот день " + newDate + ", моя ЗП будет = " + newSalary + "$");
        }
    }

    private void increaseSalaryWhile(int numberMonths) {
        System.out.println("\n Увеличение ЗП с использованием while");
        int newSalary = salary;
        LocalDate newDate = today;

        while (numberMonths-- > 0) {
            newSalary += 1000;
            newDate = newDate.plusMonths(1);
            System.out.println("В этот день " + newDate + ", моя ЗП будет = " + newSalary + "$");
        }
    }

    private void increaseSalaryDoWhile(int numberMonths) {
        System.out.println("\n Увеличение ЗП с использованием do while");
        int newSalary = salary;
        LocalDate newDate = today;

        do {
            newSalary += 1000;
            newDate = newDate.plusMonths(1);
            System.out.println("В этот день " + newDate + ", моя ЗП будет = " + newSalary + "$");
        } while (--numberMonths > 0);
    }
}
