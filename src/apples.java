public class apples {
    static int applesPete = 10; // яблоки пети
    static int applesYasa; // яблоки васи
    static int applesTotal = 15; // всего яблок

    public static void main(String[] args) {
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
