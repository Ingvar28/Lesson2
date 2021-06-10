package com.nosov;

import java.util.Arrays;
import java.util.Scanner;


public class Tasks {

    public static void task1() {

        for (int i = 1; i < 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

    public static void task2() {
        System.out.println("Деляться на 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {

                System.out.print(i + " ");
//
            }
        }
        System.out.println(" ");
        System.out.println("Деляться на 5: ");
        for (int j = 1; j < 100; j++) {
            if (j % 5 == 0) {

                System.out.print(j + " ");
//                System.out.println(" ");
            }
        }
        System.out.println(" ");

        System.out.println("Деляться на 3 и 5 ");
        for (int k = 1; k < 100; k++) {
            if (k % 3 ==0 && k % 5 ==0){

                System.out.print(k +" ");
//                System.out.println(" ");
            }

        }

    }


    public static boolean task3() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число ");
        int c = scanner.nextInt();

        return a + b == c;
    }


    public static boolean task4() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число ");
        int c = scanner.nextInt();

        return c > b && b > a;


    }

    public static boolean task5(int[] array) {
//        int[] array;
        System.out.println("array = " + Arrays.toString(array));
        return array[0] == 3 || array[array.length-1] == 3;


    }

    public static void task6(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1){
                System.out.println("Элемент массива номер " + i + " - равен 1");
            } else if (array[i] == 3) {
                System.out.println("Элемент массива номер " + i + " - равен 3");
            } else {
                continue;
            }
        }

    }




}
