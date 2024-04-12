package com.mirea.kt.example;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Стетюха Маргарита, РИБО-04-22, Вариант 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу: ");
        String path = scanner.nextLine();
        DeserializingRunnable dsr = new DeserializingRunnable(path);
        Thread th = new Thread(dsr);
        th.start();
    }
}
