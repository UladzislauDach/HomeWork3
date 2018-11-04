public class apples {


    public static void main(String[] args) {
        int applesPete = 10; // яблоки пети
        int applesYasa; // яблоки васи
        int applesTotal = 15; // всего яблок

        applesYasa = calculate(applesPete, applesTotal);
        print(applesYasa);
    }

    public static int calculate(int applesPete, int applesTotal) {
        int vApples = applesTotal - applesPete;
        return vApples;
    }

    public static void print(int z) {
        System.out.println("У Васи " + z + " яблок");

    }
}
