package org.example;

public class Main {

    public static void main(String[] args) {

        Primitives primitives = new Primitives();
        primitives.printPrimitives();

        StringMethods stringMethods = new StringMethods();
        stringMethods.printAllStringMethods();

        SalaryIncrease salaryIncrease = new SalaryIncrease();
        salaryIncrease.printAllCyclesMethods(3);

        SalaryDowngrade salaryDowngrade = new SalaryDowngrade();
        salaryDowngrade.printAllCyclesMethods(2300);

        Countdown countdown = new Countdown();
        countdown.countBack(5);

        NumberScanner numberScanner = new NumberScanner();
        numberScanner.runAllScanMethods();

        NumberScannerSwitcher numberScannerSwitcher = new NumberScannerSwitcher();
        numberScannerSwitcher.runAllScanMethods();



    }

}