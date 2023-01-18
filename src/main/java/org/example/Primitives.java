package org.example;

public class Primitives {
//    Объявить переменные всех известных типов и вывести на экран их значения.

    byte aByte = Byte.MAX_VALUE;
    short aShort = Short.MAX_VALUE;
    int anInt = Integer.MAX_VALUE;
    long aLong = Long.MAX_VALUE;
    float aFloat = Float.MAX_VALUE;
    double aDouble = Double.MAX_VALUE;
    boolean aBoolean = Boolean.FALSE;
    char aChar = Character.MAX_VALUE;

    void printPrimitives() {

        System.out.println("1. Задача: Объявить и инициализировать переменные" +
                " всех известных типов и вывести на экран их значения.");

        System.out.println("byte = " + aByte);
        System.out.println("short = " + aShort);
        System.out.println("int = " + anInt);
        System.out.println("long = " + aLong);
        System.out.println("float = " + aFloat);
        System.out.println("double = " + aDouble);
        System.out.println("boolean = " + aBoolean);
        System.out.println("char = " + aChar);
        System.out.println();
    }
}
