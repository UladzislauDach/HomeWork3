import sun.java2d.pipe.AAShapePipe;

import java.util.Arrays;

public class taskTwo {
    public static void main(String[] args) {
        // one();
        //two();
        //three();
        four();
    }

    public static void one() {
        //Создайте массив из всех нечётных чисел от 1 до 99, выведите его на экран в строку,
        int array[] = new int[50];
        array[0] = 1;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + 2;
        }
        //а затем этот же массив выведите на экран тоже в строку, но в обратном порядке
        System.out.print(Arrays.toString(array));
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + ", ");
        }
        //======================== массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран

    }

    public static void two() {
        //массив из 15 случайных целых чисел из отрезка [0;9]. Выведите массив на экран.
        // Подсчитайте сколько в массиве чётных элементов и выведете это количество на экран на отдельной строке.
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (0 + (Math.random() * (10 - 0)));
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        int a = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != 0 && arr[i] % 2 == 0)
                a++;
        System.out.println("Количество чётных элементов: " + a);

    }

    public static void three() {
        //массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
        // Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + (Math.random() * (11 - 1)));
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
            }

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void four() {
        //Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран
        // в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите,
        // для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (0 + (Math.random() * (6 - 0)));
        }
        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (0 + (Math.random() * (6 - 0)));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }


}