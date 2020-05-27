package com.senla.training.task;

import java.util.Random;

/**
 * @author Dmitry Chueshov 27.05.2020 18:39
 * @project SubTaskOne
 */

public class Main {
    public static void main(String[] args) {
        /** максимальное допустимое число в приметивном целом типе int */
        final int MAX_RANDOM = 2147483647;

        /** число которое будет сгенерировано на основании максимально допустимого числа */
        int number = 0;

        /** счетчик результатов сложения чисел */
        int sum = 0;

        Random random = new Random();

        number = random.nextInt(MAX_RANDOM);

        System.out.println("сгенерировано число : " + number);

        while (number > 0) {
            int count = number % 10;
            System.out.print(count + " ");
            sum += count;
            number /= 10;
        }
    }
}
