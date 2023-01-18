package org.example;

import java.time.LocalDate;

public class SalaryDowngrade {
//    Написать программу, которая уменьшает зп с $10000 до $0 каждый месяц используя циклы while/ do ... while, for.

    int salary = 10000;
    LocalDate today = LocalDate.now();

    void printAllCyclesMethods(int reductionAmount) {
        System.out.println("4. Написать программу, которая уменьшает зп с $10000 до $0 каждый месяц," +
                " используя циклы while/ do ... while, for.");
        System.out.println("Сегодня " + today + ", моя ЗП  = " + salary + "$");

        downgradeSalaryFor(reductionAmount);
        downgradeSalaryWhile(reductionAmount);
        downgradeSalaryDoWhile(reductionAmount);
    }

    private void downgradeSalaryFor(int reductionAmount) {
        System.out.println("\n Понижение ЗП с использованием for");
        int newSalary = salary;
        LocalDate newDay = today;

        for (; ; ) {
            if (newSalary >= reductionAmount) {
                newSalary -= reductionAmount;
            } else {
                newSalary = 0;
                System.out.println("Если понизить мою ЗП на " + reductionAmount + "$ в месяц, то в этот день "
                        + newDay + ", моя ЗП будет = " + newSalary + "$");
                break;
            }
            newDay = newDay.plusMonths(1);
            System.out.println("Если понизить мою ЗП на " + reductionAmount + "$ в месяц, то в этот день "
                    + newDay + ", моя ЗП будет = " + newSalary + "$");
        }
    }

    private void downgradeSalaryWhile(int reductionAmount) {
        System.out.println("\n Понижение ЗП с использованием while");
        int newSalary = salary;
        LocalDate newDay = today;

        while (true) {
            if (newSalary >= reductionAmount) {
                newSalary -= reductionAmount;
            } else {
                newSalary = 0;
                System.out.println("Если понизить мою ЗП на " + reductionAmount + "$ в месяц, то в этот день "
                        + newDay + ", моя ЗП будет = " + newSalary + "$");
                break;
            }
            newDay = newDay.plusMonths(1);
            System.out.println("Если понизить мою ЗП на " + reductionAmount + "$ в месяц, то в этот день "
                    + newDay + ", моя ЗП будет = " + newSalary + "$");
        }
    }

    private void downgradeSalaryDoWhile(int reductionAmount) {
        System.out.println("\n Понижение ЗП с использованием do while");
        int newSalary = salary;
        LocalDate newDay = today;

        do {
            if (newSalary >= reductionAmount) {
                newSalary -= reductionAmount;
            } else {
                newSalary = 0;
                System.out.println("Если понизить мою ЗП на " + reductionAmount + "$ в месяц, то в этот день "
                        + newDay + ", моя ЗП будет = " + newSalary + "$");
                break;
            }
            newDay = newDay.plusMonths(1);
            System.out.println("Если понизить мою ЗП на " + reductionAmount + "$ в месяц, то в этот день "
                    + newDay + ", моя ЗП будет = " + newSalary + "$");
        } while (true);
    }
}
