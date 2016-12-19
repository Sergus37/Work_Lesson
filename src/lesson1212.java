

    /* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class lesson1212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        //программа на языке brainfuck
        //String code = "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.>+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++.<.>.<.>.";
        //String code = ",...";
        //String code = ",>,<..>..";
        String code = ",";

        //Номер символа из прогаммы который сейчас надо выполнить
        int currentSymbol = 0;

        //Данные 1:  номер активной ячейки
        int i = 0;

        //Данные 2: 30000 пустых ячеек
        char[] array = new char[30000];

        //Пока мы не выполнили всю строку
        //надо выполить очередной символ

        for (currentSymbol = 0; currentSymbol < code.length(); currentSymbol++) {
            char command = code.charAt(currentSymbol);// один из символов +- <> ., []
            switch (command) {
                case '+':
                    array[i] = (char) (array[i] + 1);
                    break;
                case '-':
                    array[i] = (char) (array[i] - 1);
                    break;
                case '>':
                    i++;
                    break;
                case '<':
                    i--;
                    break;
                case '.':
                    System.out.print(array[i]);
                    break;
                case ',':
                    array [i] = scanner.next(). charAt (0);
                    break;

            }

        }


    }
}