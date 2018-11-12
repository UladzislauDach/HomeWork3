import java.util.Arrays;
import java.util.Scanner;

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
        nine();
        ten();
        eleven();
        twelve();
        thirteen();
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
        int a = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[a]) {
                a = i;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Индекс максимального числа " + a);
    }

    public static void eight() {
        //два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел. Каждый
        // элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым
        // индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной
        // строке), затем вывести количество целых элементов в третьем массиве.
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (2 + (Math.random() * (10 - 2)));
        }
        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (2 + (Math.random() * (10 - 2)));
        }
        double[] arr3 = new double[10];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = (double) (arr[i]) / (double) (arr2[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        int a = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] % 1 == 0) {

                a++;
            }
        }
        System.out.println("Количество целых элементов массива №3 = " + a);
    }

    public static void nine() {
        //Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку.
        // Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.
        // Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
        int[] arr = new int[11];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-2 + (Math.random() * (2 + 2)));
        }
        System.out.println(Arrays.toString(arr));
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == -1) {
                a++;
            }
            if (arr[i] == 0) {
                b++;
            }
            if (arr[i] == 1) {
                c++;
            }
        }
        if (a > b && a > c) {
            System.out.println("Чаще всего встречается число -1");
        }
        if (b > a && b > c) {
            System.out.println("Чаще всего встречается число 0");
        }
        if (c > a && c > b) {
            System.out.println("Чаще всего встречается число 1");
        } else System.out.println();
    }

    public static void ten() {
        //Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив
        // указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого
        // программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше:
        // левой или правой, либо сообщить, что эти суммы модулей равны. Если пользователь введёт неподходящее число,
        // то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.
        System.out.println("Введите чётное положительное число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a % 2 != 0 || a <= 0) {
            System.out.println("Введите именно чётное положительное число");
            a = scanner.nextInt();
        }
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-6 + (Math.random() * (6 + 6)));
        }
        System.out.println(Arrays.toString(arr));
        int sumarr1 = 0;
        int sumarr2 = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            sumarr1 = sumarr1 + arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumarr2 = sumarr2 + arr[i];
        }
        if (Math.abs(sumarr1) > Math.abs(sumarr2)) System.out.println("Модуль суммы первой половины массива больше второй");
        if (Math.abs(sumarr1) < Math.abs(sumarr2)) System.out.println("Модуль суммы второй половины больше первой");
        if (Math.abs(sumarr1) == Math.abs(sumarr2)) System.out.println("Модули сумм половин массива равны");
    }

    public static void eleven() {
        //Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, чтобы
        // отрицательных и положительных элементов там было поровну и не было нулей. При этом порядок следования
        // элементов должен быть случаен (т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6
        // положительных, а потом 6 отрицательных чисел или же когда элементы постоянно чередуются через один и пр.).
        // Вывести полученный массив на экран.
        int a, b, c = 0;
        int[] arr = new int[12];
        do {
            a = 0;
            b = 0;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (-11 + (Math.random() * (11 + 11)));
                while (arr[i] == 0) {
                    arr[i] = (int) (-11 + (Math.random() * (11 + 11)));
                    c++;
                }
                if (arr[i] < 0) a++;
                if (arr[i] > 0) b++;

            }
        }
        while (a != b);
        System.out.println(c);
        System.out.println(Arrays.toString(arr));
    }

    public static void twelve() {
        //Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n.
        // Если пользователь ввёл не подходящее число, то программа должна просить пользователя повторить ввод.
        // Создать массив из n случайных целых чисел из отрезка [0;n] и вывести его на экран. Создать второй массив
        // только из чётных элементов первого массива, если они там есть, и вывести его на экран.
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите число больше 3");
            n = scanner.nextInt();
        }
        while (n < 4);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-1 + (Math.random() * ((n + 1) + 1)));
        }
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                a++;
            }
        }
        int[] arr2 = new int[a];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                b++;
                arr2[b - 1] = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static void thirteen() {
        // Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в
        // строку, отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого
        // началом новой строки). Перед созданием массива подумайте, какого он будет размера.
        int[] arr = new int[10];
        arr[0] = 2;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 2;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }


}



