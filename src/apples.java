public class apples {

    static int pApples = 10; // яблоки пети
    static int vApples; // яблоки васи
    static int applesSumm = 15; // всего яблок

    public static void main(String[] args) {

        //vApples = applesSumm - pApples; // задание 1
        System.out.println("У васи " + calculate(applesSumm, pApples) + " яблок");

    }

    public static int calculate(int a, int b) {
        int vApples = a - b;
        return vApples;


    }
}
