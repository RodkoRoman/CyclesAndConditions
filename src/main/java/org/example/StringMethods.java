package org.example;

public class StringMethods {
//    Объявить строку с полным именем. Вывести на экран результат всех стандартных методов работы со строками

    String myName = "Roman";

    void printAllStringMethods() {
        System.out.println("2. Задача: Объявить строку с полным именем." +
                " Вывести на экран результат всех стандартных методов работы со строками");
        System.out.println("Заданное имя = " + myName);

        printLength();
        printIsEmpty();
        printCharAt();
        printGetChars();
        printEquals();
        printEqualsIgnoreCase();
        printStartsWith();
        printEndsWith();
        printConcat();
        printReplace();
        printContains();
        System.out.println();

    }

    private void printLength() {
        System.out.println("Длина имени = " + myName.length());
    }

    private void printIsEmpty() {
        System.out.println("Пустое ли имя? = " + myName.isEmpty());
    }

    private void printCharAt() {
        System.out.println("Первая буква имени = " + myName.charAt(0));
    }

    private void printGetChars() {
        char[] charsArray = new char[3];
        myName.getChars(0, 3, charsArray, 0);

        System.out.print("Первые 3 буквы имени = ");
        for (char element : charsArray) {
            System.out.print(element);
        }
        System.out.println();
    }

    private void printEquals() {
        String newName = "roman";
        System.out.println("Равны ли \"" + myName + "\" и \"" + newName + "\" по equals? = " + myName.equals(newName));
    }

    private void printEqualsIgnoreCase() {
        String newName = "roman";
        System.out.println("Равны ли \"" + myName + "\" и \"" + newName + "\" по equalsIgnoreCase? = "
                + myName.equalsIgnoreCase(newName));
    }

    private void printStartsWith() {
        System.out.println("Начинается ли имя на \"Rom\"? = " + myName.startsWith("Rom"));
    }

    private void printEndsWith() {
        System.out.println("Заканчивается ли имя на \"an\"? = " + myName.endsWith("an"));
    }

    private void printConcat() {
        System.out.println("Конкатенирование строки = " + myName.concat(" Rodko"));
    }

    private void printReplace() {
        System.out.println("Замена части строки, \"man\" на \"dko\" = " + myName.replace("man", "dko"));
    }

    private void printContains() {
        System.out.println("Содержит ли имя подстроку \"oma\"? = " + myName.contains("oma"));
    }


}
