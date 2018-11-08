import java.util.Arrays;

public class taskTwo {
    public static void main(String[] args) {
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
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
        System.out.println("Первый массив: " + Arrays.toString(arr));
        System.out.println("Второй массив: " + Arrays.toString(arr2));
        double a = 0;
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        System.out.println("Среднее первого массива " + a / arr.length);
        double b = 0;
        for (int i = 0; i < arr2.length; i++) {
            b += arr2[i];
        }
        System.out.println("Среднее второго массива " + b / arr2.length);
        if (a > b) {
            System.out.println("Среднее арифметическое первого массива больше");
        }
        if (b > a) {
            System.out.println("Среднее арифметическое второго массива больше");
        }
        if (b == a) {
            System.out.println("Средние арефмитические массивов равны");
        }
    }

    public static void five() {
        //массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. Определить
        // и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (10 + (Math.random() * (100 - 10)));
        }
        System.out.println(Arrays.toString(arr));
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[++i]) { //косяк????
                a++;
            }
        }
        if (a == 3)
            System.out.println("Массив с строго возрастающей последовательностью");

        else
            System.out.println("Массив НЕ с строго возрастающей последовательностью");
    }

    public static void six() {
        //массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и
        // второй члены последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void seven() {
        //массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является
        // в этом массиве максимальным и сообщите индекс его последнего вхождения в массив
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-16 + (Math.random() * (16 + 16)));
        }
        int indexOfMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[indexOfMax]) {
                indexOfMax = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Индекс максимального числа " + indexOfMax);
    }

    public static void eight() {
        //два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел. Каждый
        // элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым
        // индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной
        // строке), затем вывести количество целых элементов в третьем массиве.
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (1 + (Math.random() * (10 - 1)));
        }
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (1 + (Math.random() * (10 - 1)));
        }
        double[] arr3 = new double[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (double) (arr[i]) / (double) (arr2[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        int a = 0;
        for (int i = 0; i<arr3.length; i++){
            if (arr3[i]%1==0){

                a++;
            }
        }
        System.out.println("Количество целых элементов массива №3 = " + a);
    }
}